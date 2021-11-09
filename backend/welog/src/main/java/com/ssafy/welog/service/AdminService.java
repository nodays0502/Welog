package com.ssafy.welog.service;

import com.ssafy.welog.api.controller.dto.AdminDto.BoardRollBackReqDto;
import com.ssafy.welog.api.controller.dto.AdminDto.BoardRollBackResDto;
import com.ssafy.welog.api.controller.dto.AdminDto.ChangeBoardReqDto;
import com.ssafy.welog.api.controller.dto.AdminDto.SeachUserDto;
import com.ssafy.welog.api.controller.dto.AdminDto.SearchAllUserResDto;
import com.ssafy.welog.api.controller.dto.AdminDto.UserChangeReqDto;
import com.ssafy.welog.domain.common.AuthLevel;
import com.ssafy.welog.domain.entity.BoardRepository;
import com.ssafy.welog.domain.entity.User;
import com.ssafy.welog.domain.entity.UserRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    public AdminService(UserRepository userRepository, BoardRepository boardRepository){
        this.userRepository = userRepository;
        this.boardRepository = boardRepository;
    }
    @Transactional
    public void deleteUser(String userEmail) {
        if(userRepository.existsByUserEmail(userEmail)){
            userRepository.deleteByUserEmail(userEmail);
        }
        log.info("유저 삭제");
    }
    @Transactional
    public void changeUser(UserChangeReqDto userChangeReqDto) {
        String email = userChangeReqDto.getUserEmail();
        if(userRepository.existsByUserEmail(email)){

            User user = userRepository.findByUserEmail(email).get();
            System.out.println(user);
            user.changeInfo(null,null,userChangeReqDto.getAuthLevel());
            System.out.println(user);
        }
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

        User user = userRepository.findByUserEmail(userEmail).get();
        SeachUserDto seachUserDto = SeachUserDto.builder()
            .userId(user.getUserId())
            .authLevel(user.getUserRole())
            .userEmail(user.getUserEmail())
            .userName(user.getUserName())
            .build();
        return  seachUserDto;
    }

    // 글 권한 수정
    @Transactional
    public void changeBoard(ChangeBoardReqDto changeBoardReqDto) {
        log.info("게시글 권한 변경");
    }
    @Transactional
    public BoardRollBackResDto rollBackBoard(BoardRollBackReqDto boardRollBackReqDto) {
        log.info("게시글 롤백");
        return BoardRollBackResDto.builder()
            .content("내용")
            .version("3.5.1")
            .build();
    }

}
