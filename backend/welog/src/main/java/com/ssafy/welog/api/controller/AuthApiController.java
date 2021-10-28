package com.ssafy.welog.api.controller;

import static com.ssafy.welog.common.util.constants.ResponseConstants.OK;

import com.ssafy.welog.api.controller.dto.AuthDto.LoginReqDto;
import com.ssafy.welog.api.controller.dto.AuthDto.LoginResDto;
import com.ssafy.welog.service.AuthService;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/auth")
public class AuthApiController {

    private final AuthService authService;

    public AuthApiController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping
    public ResponseEntity<LoginResDto> login(LoginReqDto loginReqDto){
        return ResponseEntity.ok(authService.login(loginReqDto));
    }

    @DeleteMapping
    public ResponseEntity<Void> logout(){
        authService.logout();
        return OK;
    }
}
