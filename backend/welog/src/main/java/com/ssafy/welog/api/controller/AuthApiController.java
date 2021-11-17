package com.ssafy.welog.api.controller;

import com.ssafy.welog.api.controller.dto.AuthDto.LoginReqDto;
import com.ssafy.welog.api.controller.dto.AuthDto.LoginResDto;
import com.ssafy.welog.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import static com.ssafy.welog.common.util.constants.ResponseConstants.OK;

@Slf4j
@RestController
@RequestMapping("/api/auth")
public class AuthApiController {

    private final AuthService authService;

    public AuthApiController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping
    public ResponseEntity<LoginResDto> login(@Valid @RequestBody LoginReqDto loginReqDto, HttpSession httpSession){
        return ResponseEntity.ok(authService.login(loginReqDto,httpSession));
    }

    @DeleteMapping
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<Void> logout(HttpServletRequest request){
        authService.logout(request.getSession());
        request.getSession(true);
        return OK;
    }
}
