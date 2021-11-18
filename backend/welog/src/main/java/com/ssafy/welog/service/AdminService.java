package com.ssafy.welog.service;

import com.ssafy.welog.api.controller.dto.AdminDto.BoardRollBackReqDto;
import com.ssafy.welog.api.controller.dto.AdminDto.BoardRollBackResDto;
import com.ssafy.welog.api.controller.dto.AdminDto.ChangeBoardReqDto;
import com.ssafy.welog.api.controller.dto.AdminDto.SeachUserDto;
import com.ssafy.welog.api.controller.dto.AdminDto.SearchAllUserResDto;
import com.ssafy.welog.api.controller.dto.AdminDto.UserChangeReqDto;

import com.ssafy.welog.common.util.RedisUtil;
import com.ssafy.welog.domain.entity.User;
import com.ssafy.welog.domain.repository.BoardRepository;
import com.ssafy.welog.domain.repository.UserRepository;

import com.ssafy.welog.domain.entity.Board;

import com.ssafy.welog.exception.board.BoardNotFoundException;
import com.ssafy.welog.exception.user.UserNotFoundException;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional(readOnly = true)
public class AdminService {

    private final UserRepository userRepository;
    private final BoardRepository boardRepository;
    private final RedisUtil redisUtil;
    public AdminService(UserRepository userRepository, BoardRepository boardRepository,
        RedisUtil redisUtil) {
        this.userRepository = userRepository;
        this.boardRepository = boardRepository;
        this.redisUtil = redisUtil;
    }

    @Transactional
    public void deleteUser(String userEmail) {
        if (userRepository.existsByUserEmail(userEmail)) {
            userRepository.deleteByUserEmail(userEmail);
        }
        log.info("유저 삭제");
    }

    @Transactional
    public void changeUser(UserChangeReqDto userChangeReqDto) {
        String email = userChangeReqDto.getUserEmail();
        User user = userRepository.findByUserEmail(email)
            .orElseThrow(() -> new UserNotFoundException("해당하는 유저가 존재하지 않습니다."));
        System.out.println(user);
        user.changeInfo(null, null, userChangeReqDto.getAuthLevel());
        System.out.println(user);
        log.info("유저 권한 변경");
    }

    public SearchAllUserResDto searchAllUser() {
        log.info("모든 유저 조회");
        List<User> all = userRepository.findAll();
        List<SeachUserDto> userList = all.stream().map(user -> SeachUserDto.builder()
            .userId(user.getUserId())
            .authLevel(user.getUserRole())
            .userEmail(user.getUserEmail())
            .userName(user.getUserName())
            .build()).collect(Collectors.toList());

        return SearchAllUserResDto.builder()
            .userList(userList)
            .build();
    }

    public SeachUserDto searchUser(String userEmail) {
        log.info("하나의 유저 조회");

        User user = userRepository.findByUserEmail(userEmail)
            .orElseThrow(() -> new UserNotFoundException("해당하는 유저가 존재하지 않습니다."));
        SeachUserDto seachUserDto = SeachUserDto.builder()
            .userId(user.getUserId())
            .authLevel(user.getUserRole())
            .userEmail(user.getUserEmail())
            .userName(user.getUserName())
            .build();
        return seachUserDto;
    }

    // 글 권한 수정
    @Transactional
    public void changeBoard(ChangeBoardReqDto changeBoardReqDto) {
        log.info("게시글 권한 변경");
        Board board = boardRepository.findById(changeBoardReqDto.getBoardId())
            .orElseThrow(() -> new BoardNotFoundException("해당하는 게시글이 존재하지 않습니다."));
        System.out.println(changeBoardReqDto);
        board.changeAuth(changeBoardReqDto.getAuthLevel());
    }

    @Transactional
    public BoardRollBackResDto rollBackBoard(BoardRollBackReqDto boardRollBackReqDto) {
        log.info("게시글 롤백");
        Board board = boardRepository.findById(boardRollBackReqDto.getBoardId()).orElseThrow(
            () -> new BoardNotFoundException("해당하는 게시글이 존재하지 않습니다.")
        );
        Board management = null;
        try{
            management = (Board)redisUtil.getManagement(board.getBoardId() + ":" + boardRollBackReqDto.getVersion());
            System.out.println(management);
            System.out.println(management.getVersion());
            System.out.println(management.getContent());
        }catch(Exception e){
            e.printStackTrace();
        }
        board.change(null, management.getContent(), management.getVersion());
        return BoardRollBackResDto.builder()
            .content(board.getContent())
            .version(board.getVersion())
            .build();
    }

}
