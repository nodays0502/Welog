package com.ssafy.welog.api.controller;

import com.ssafy.welog.api.controller.dto.AdminDto.*;
import com.ssafy.welog.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.ssafy.welog.common.util.constants.ResponseConstants.OK;

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
    @PreAuthorize("hasAnyRole('ADMIN')")
    public ResponseEntity<Void> deleteUser(@PathVariable String userEmail) {
        adminService.deleteUser(userEmail);
        return OK;
    }

    /*
     * 해당 유저 권한 변경하는 메서드
     */
    @PatchMapping("/user")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public ResponseEntity<Void> changeUser(@Valid @RequestBody UserChangeReqDto userChangeReqDto) {
        adminService.changeUser(userChangeReqDto);
        return OK;
    }

    /*
     * 모든 유저를 조회하는 메서드
     */
    @GetMapping("/user")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public ResponseEntity<SearchAllUserResDto> searchAllUser() {
        return ResponseEntity.ok(adminService.searchAllUser());
    }

    @GetMapping("/user/{userEmail}")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public ResponseEntity<SeachUserDto> searchUser(@PathVariable String userEmail) {
        return ResponseEntity.ok(adminService.searchUser(userEmail));
    }


    // 게시글 권한 수정 변경하는 메서드
    @PatchMapping("/board")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public ResponseEntity<Void> changeBoard(@Valid @RequestBody ChangeBoardReqDto changeBoardReqDto) {
        adminService.changeBoard(changeBoardReqDto);
        return OK;
    }

    // 게시글 롤백 하는 메서드
    @PatchMapping("/rollbackboard")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public ResponseEntity<BoardRollBackResDto> rollBackBoard(
        @Valid @RequestBody BoardRollBackReqDto boardRollBackReqDto) {
        return ResponseEntity.ok(adminService.rollBackBoard(boardRollBackReqDto));
    }
}
