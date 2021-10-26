package com.ssafy.welog.service;

import com.ssafy.welog.api.controller.dto.AdminDto.BoardRollBackReqDto;
import com.ssafy.welog.api.controller.dto.AdminDto.BoardRollBackResDto;
import com.ssafy.welog.api.controller.dto.AdminDto.SearchAllUserReqDto;
import com.ssafy.welog.api.controller.dto.AdminDto.UserChangeReqDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AdminService {

    public void deleteUser(Long userId) {
        log.info("유저 삭제");
    }

    public void changeUser(UserChangeReqDto userChangeReqDto) {
        log.info("유저 권한 변경");
    }

    public SearchAllUserReqDto searchAllUser() {
        log.info("모든 유저 조회");
        return SearchAllUserReqDto.builder().build();
    }

    // 글 수정 권한 변경????

    public BoardRollBackResDto rollBackBoard(BoardRollBackReqDto boardRollBackReqDto) {
        log.info("게시글 롤백");
        return BoardRollBackResDto.builder().build();
    }

}
