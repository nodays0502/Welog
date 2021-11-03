package com.ssafy.welog.service;

import com.ssafy.welog.api.controller.dto.AdminDto.BoardRollBackReqDto;
import com.ssafy.welog.api.controller.dto.AdminDto.BoardRollBackResDto;
import com.ssafy.welog.api.controller.dto.AdminDto.ChangeBoardReqDto;
import com.ssafy.welog.api.controller.dto.AdminDto.SeachUserDto;
import com.ssafy.welog.api.controller.dto.AdminDto.SearchAllUserResDto;
import com.ssafy.welog.api.controller.dto.AdminDto.UserChangeReqDto;
import com.ssafy.welog.domain.common.AuthLevel;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AdminService {

    public void deleteUser(String userEmail) {
        log.info("유저 삭제");
    }

    public void changeUser(UserChangeReqDto userChangeReqDto) {
        log.info("유저 권한 변경");
    }

    public SearchAllUserResDto searchAllUser() {
        log.info("모든 유저 조회");
        List<SeachUserDto> userList = new ArrayList<>();
        userList.add(SeachUserDto.builder()
            .userId(1L)
            .authLevel(AuthLevel.ADMIN)
            .userEmail("no@naver.com")
            .userName("왕")
            .build()
        );
        userList.add(SeachUserDto.builder()
            .userId(2L)
            .authLevel(AuthLevel.AUTH)
            .userEmail("wo@naver.com")
            .userName("시민")
            .build()
        );
        return SearchAllUserResDto.builder()
            .userList(userList)
            .build();
    }

    public SearchAllUserResDto searchUser(String userEmail) {
        log.info("하나의 유저 조회");
        List<SeachUserDto> userList = new ArrayList<>();
        userList.add(SeachUserDto.builder()
            .userId(2L)
            .authLevel(AuthLevel.AUTH)
            .userEmail("wo@naver.com")
            .userName("시민")
            .build()
        );
        return SearchAllUserResDto.builder()
            .userList(userList)
            .build();
    }

    // 글 권한 수정
    public void changeBoard(ChangeBoardReqDto changeBoardReqDto) {
        log.info("게시글 권한 변경");
    }

    public BoardRollBackResDto rollBackBoard(BoardRollBackReqDto boardRollBackReqDto) {
        log.info("게시글 롤백");
        return BoardRollBackResDto.builder()
            .content("내용")
            .version("3.5.1")
            .build();
    }

}
