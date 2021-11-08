package com.ssafy.welog.api.controller;

import static com.ssafy.welog.common.util.constants.ResponseConstants.OK;

import com.ssafy.welog.api.controller.dto.AdminDto.BoardRollBackReqDto;
import com.ssafy.welog.api.controller.dto.AdminDto.BoardRollBackResDto;
import com.ssafy.welog.api.controller.dto.AdminDto.ChangeBoardReqDto;
import com.ssafy.welog.api.controller.dto.AdminDto.SearchAllUserResDto;
import com.ssafy.welog.api.controller.dto.AdminDto.UserChangeReqDto;
import com.ssafy.welog.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/admin")
public class AdminApiController {

    private final AdminService adminService;

    public AdminApiController(@RequestBody AdminService adminService) {
        this.adminService = adminService;
    }

    /*
     * 해당 유저를 삭제하는 구현한 메서드
     */
    @DeleteMapping("/user/{userEmail}")
    public ResponseEntity<Void> deleteUser(@PathVariable String userEmail) {
        adminService.deleteUser(userEmail);
        return OK;
    }

    /*
     * 해당 유저 권한 변경하는 메서드
     */
    @PatchMapping("/user")
    public ResponseEntity<Void> changeUser(@RequestBody UserChangeReqDto userChangeReqDto) {
        adminService.changeUser(userChangeReqDto);
        return OK;
    }

    /*
     * 모든 유저를 조회하는 메서드
     */
    @GetMapping("/user")
    public ResponseEntity<SearchAllUserResDto> searchAllUser() {
        return ResponseEntity.ok(adminService.searchAllUser());
    }

    @GetMapping("/user/{userEmail}")
    public ResponseEntity<SearchAllUserResDto> searchUser(@PathVariable String userEmail) {
        return ResponseEntity.ok(adminService.searchUser(userEmail));
    }


    // 게시글 권한 수정 변경하는 메서드
    @PatchMapping("/board")
    public ResponseEntity<Void> changeBoard(@RequestBody ChangeBoardReqDto changeBoardReqDto) {
        adminService.changeBoard(changeBoardReqDto);
        return OK;
    }

    // 게시글 롤백 하는 메서드
    @PatchMapping("/rollbackboard")
    public ResponseEntity<BoardRollBackResDto> rollBackBoard(
        @RequestBody BoardRollBackReqDto boardRollBackReqDto) {
        return ResponseEntity.ok(adminService.rollBackBoard(boardRollBackReqDto));
    }
}
