package com.ssafy.welog.api.controller;


import static com.ssafy.welog.common.util.constants.ResponseConstants.*;

import com.ssafy.welog.api.controller.dto.UserDto.UserInfoDto;
import com.ssafy.welog.service.UserService;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController {

    private final UserService userService;

    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    /*
     * 회원탈퇴 기능을 구현한 메서드
     */
    @DeleteMapping
    public ResponseEntity<Void> deleteUser() {
        userService.deleteUser();
        return OK;
    }


    /*
     * 사용자의 회원정보를 조회하기 위한 메서드
     */
    @GetMapping("/{email}")
    public ResponseEntity<UserInfoDto> getUserInfo(
        @PathVariable String email) {
        return ResponseEntity.ok(userService.getUser(email));
    }

}