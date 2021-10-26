package com.ssafy.welog.api.controller;

import static com.ssafy.welog.common.util.constants.ResponseConstants.OK;

import com.ssafy.welog.api.controller.dto.AdminDto.BoardRollBackReqDto;
import com.ssafy.welog.api.controller.dto.AdminDto.BoardRollBackResDto;
import com.ssafy.welog.api.controller.dto.AdminDto.SearchAllUserReqDto;
import com.ssafy.welog.api.controller.dto.AdminDto.UserChangeReqDto;
import com.ssafy.welog.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/admin")
public class AdminApiController {
    private final AdminService adminService;
    public AdminApiController(AdminService adminService){
        this.adminService = adminService;
    }
    /*
     * 해당 유저를 삭제하는 구현한 메서드
     */
    @DeleteMapping("/user/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
        adminService.deleteUser(userId);
        return OK;
    }
    /*
     * 해당 유저 권한 변경하
     */
    @PatchMapping("/user")
    public ResponseEntity<Void> changeUser(UserChangeReqDto userChangeReqDto) {
        adminService.changeUser(userChangeReqDto);
        return OK;
    }
    @GetMapping("/user")
    public ResponseEntity<SearchAllUserReqDto> searchAllUser() {
        SearchAllUserReqDto searchAllUserReqDto = adminService.searchAllUser();
        return ResponseEntity.ok(searchAllUserReqDto);
    }


    // 글 수정 권한 변경????
    @PatchMapping("/board")
    public ResponseEntity<BoardRollBackResDto> rollBackBoard(BoardRollBackReqDto boardRollBackReqDto) {
        BoardRollBackResDto boardRollBackResDto = adminService.rollBackBoard(boardRollBackReqDto);
        return ResponseEntity.ok(boardRollBackResDto);
    }
}
