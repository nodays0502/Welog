package com.ssafy.welog.service;

import com.ssafy.welog.api.controller.dto.BoardDto;
import com.ssafy.welog.api.controller.dto.BoardDto.AddBoardReqDto;
import com.ssafy.welog.api.controller.dto.BoardDto.PageDto;
import com.ssafy.welog.api.controller.dto.BoardDto.SearchBoardDto;
import com.ssafy.welog.api.controller.dto.BoardDto.SearchBoardResDto;
import com.ssafy.welog.common.util.RedisUtil;
import com.ssafy.welog.domain.repository.BoardRepository;
import com.ssafy.welog.api.controller.dto.BoardDto.*;
import com.ssafy.welog.domain.common.AuthLevel;
import com.ssafy.welog.domain.entity.Board;
import com.ssafy.welog.domain.entity.User;
import com.ssafy.welog.domain.entity.UserBoard;
import com.ssafy.welog.domain.repository.UserBoardRepository;
import com.ssafy.welog.domain.repository.UserRepository;
import com.ssafy.welog.exception.board.BoardNotFoundException;
import com.ssafy.welog.exception.user.UserNotFoundException;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional(readOnly = true)
public class BoardService {

    private final BoardRepository boardRepository;
    private final UserRepository userRepository;
    private final UserBoardRepository userBoardRepository;
    private final RedisUtil redisUtil;

    public BoardService(UserRepository userRepository, BoardRepository boardRepository
        , UserBoardRepository userBoardRepository,
        RedisUtil redisUtil) {
        this.boardRepository = boardRepository;
        this.userRepository = userRepository;
        this.userBoardRepository = userBoardRepository;
        this.redisUtil = redisUtil;
    }

    @Transactional
    public void addBoard(User user, AddBoardReqDto addBoardDto) {
        User writer = userRepository.findById(user.getUserId())
            .orElseThrow(() -> new UserNotFoundException("???????????? ????????? ???????????? ????????????."));
        System.out.println(addBoardDto);
        Board board = Board.builder()
            .content(addBoardDto.getContent())
            .title(addBoardDto.getTitle())
            .version(addBoardDto.getVersion())
            .category(addBoardDto.getCategory())
            .authLevel(addBoardDto.getAuthLevel())
            .build();
        boardRepository.save(board);
        System.out.println("board:" + board.getBoardId());
        UserBoard userBoard = UserBoard.builder()
            .board(board)
            .user(writer)
            .build();
        userBoardRepository.save(userBoard);
        log.info("????????? ??????");
        try {
            String key = board.getBoardId() + ":" + board.getVersion();
            redisUtil.setManagement(key, board);
            redisUtil.setManagementVersionList(board.getBoardId().toString(), key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public SearchBoardResDto searchAllBoard(Integer page) {
        log.info("????????? ?????? ??????");
        if (page == null) {
            page = 0;
        }
        PageRequest pageRequest = PageRequest.of(page, 10, Direction.ASC, "boardId");
        Page<Board> boardList = boardRepository.findAll(pageRequest);
        List<SearchBoardDto> collect = boardList.stream()
            .map(o -> SearchBoardDto.builder()
                .boardId(o.getBoardId())
                .content(o.getContent())
                .title(o.getTitle())
                .version(o.getVersion())
                .category(o.getCategory())
                .auth(o.getAuthLevel())
                .registerTime(o.getRegisterTime())
                .build()).collect(Collectors.toList());
        return SearchBoardResDto.builder().boardList(collect).build();
    }

    public SearchBoardDto searchBoard(Long boardId) {
        Board board = boardRepository.findById(boardId)
            .orElseThrow(() -> new BoardNotFoundException("???????????? ???????????? ???????????? ????????????."));
        log.info("????????? ?????? ??????");
        return SearchBoardDto.builder()
            .boardId(board.getBoardId())
            .content(board.getContent())
            .title(board.getTitle())
            .version(board.getVersion())
            .category(board.getCategory())
            .registerTime(board.getRegisterTime())
            .auth(board.getAuthLevel())
            .build();
    }

    @Transactional
    public void changeBoard(User user, ChangeBoardReqDto changeBoardDto) {
        log.info("????????? ??????");
        System.out.println(changeBoardDto);
        User writer = userRepository.findById(user.getUserId()).get();
        Board board = boardRepository.findById(changeBoardDto.getBoardId())
            .orElseThrow(() -> new BoardNotFoundException("???????????? ???????????? ???????????? ????????????."));
        if (writer.getUserRole() == AuthLevel.ADMIN
            || board.getAuthLevel() == writer.getUserRole()) {
            board.change(changeBoardDto.getTitle(), changeBoardDto.getContent(),
                changeBoardDto.getVersion());
            String key = board.getBoardId() + ":" + board.getVersion();
            redisUtil.setManagement(key, board);
            redisUtil.setManagementVersionList(board.getBoardId().toString(), key);
        } else {
            // ?????? ?????? ??????
            log.info("?????? ??????");
        }
    }

    @Transactional
    public void deleteBoard(User user, Long boardId) {
        log.info("????????? ??????");
        User writer = userRepository.findById(user.getUserId())
            .orElseThrow(() -> new UserNotFoundException("???????????? ????????? ???????????? ????????????."));
        Board board = boardRepository.findById(boardId)
            .orElseThrow(() -> new BoardNotFoundException("???????????? ???????????? ???????????? ????????????."));
        if (writer.getUserRole() == AuthLevel.ADMIN || writer.getUserRole() != board.getAuthLevel()
            || userBoardRepository.existsByUserAndBoard(writer, board)) {
            board.getUserBoards().forEach(o -> {
                o.deleteUserBoard();
                userBoardRepository.delete(o);
            });
            try {
                redisUtil.getManagementVersionList(board.getBoardId().toString()).stream()
                    .forEach(s -> {
                        System.out.println("delete:"+s);
                        redisUtil.deleteManagement(s);
                    });
                redisUtil.deleteManagement(board.getBoardId().toString());
                boardRepository.delete(board);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // ?????? ?????? ??????  -> ???????????? ??????
        }
    }

    @Transactional
    public void addFavorite(Long boardId) {
        log.info("???????????? ??????");
    }

    @Transactional
    public void deleteFavorite(Long boardId) {
        log.info("???????????? ??????");
    }

    public getRollbackResDto getRollbackList(Long boardId) {
        log.info("?????? ?????????");
        List<String> managementVersionList = null;
        try {
            managementVersionList = redisUtil.getManagementVersionList(boardId.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getRollbackResDto.builder()
            .versions(managementVersionList)
            .build();
    }
}
