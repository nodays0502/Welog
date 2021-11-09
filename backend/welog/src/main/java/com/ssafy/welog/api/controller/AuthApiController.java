package com.ssafy.welog.api.controller;

import static com.ssafy.welog.common.util.constants.ResponseConstants.OK;

import com.ssafy.welog.api.controller.dto.AuthDto.LoginReqDto;
import com.ssafy.welog.api.controller.dto.AuthDto.LoginResDto;
import com.ssafy.welog.domain.entity.User;
import com.ssafy.welog.service.AuthService;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity<Void> login(@RequestBody LoginReqDto loginReqDto, HttpSession httpSession){
        authService.login(loginReqDto,httpSession);
        return OK;
    }

    @DeleteMapping
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<Void> logout(HttpServletRequest req){
        authService.logout(req.getHeader("Authorization").substring(7));
        return OK;
    }
}
