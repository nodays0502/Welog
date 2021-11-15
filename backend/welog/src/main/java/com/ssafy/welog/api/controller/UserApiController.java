package com.ssafy.welog.api.controller;


import com.ssafy.welog.api.controller.dto.UserDto.UserCreateReqDto;
import com.ssafy.welog.api.controller.dto.UserDto.UserInfoDto;
import com.ssafy.welog.api.controller.dto.UserDto.UserListResDto;
import com.ssafy.welog.api.controller.dto.UserDto.UserPutReqDto;
import com.ssafy.welog.domain.entity.User;
import com.ssafy.welog.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.ssafy.welog.common.util.constants.ResponseConstants.OK;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController {

    private final UserService userService;

    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Void> createUser(@Valid @RequestBody UserCreateReqDto userCreateReqDto ){
        System.out.println("controller");
        userService.createUser(userCreateReqDto);
        return OK;
    }

    /*
     * 회원탈퇴 기능을 구현한 메서드
     */
    @DeleteMapping
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<Void> deleteUser(@AuthenticationPrincipal User user) {
        System.out.println("delete User");
        System.out.println("user:"+user);
        userService.deleteUser(user.getUserId());
        return OK;
    }


    /*
     * 사용자의 회원정보를 조회하기 위한 메서드
     */
    @GetMapping
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<UserInfoDto> getUserInfo(
        @AuthenticationPrincipal User user) {
        return ResponseEntity.ok(userService.getUser(user.getUserId()));
    }

    @PatchMapping
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<Void> patchUserInfo(@AuthenticationPrincipal User user, @Valid @RequestBody UserPutReqDto userPutReqDto) {
        userService.patchUser(user.getUserId(), userPutReqDto);
        return OK;
    }
    @GetMapping("/usernames")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<UserListResDto> getUserNameList() {
        return ResponseEntity.ok(userService.getUserNameList());
    }
}
