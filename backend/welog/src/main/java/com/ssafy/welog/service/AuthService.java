package com.ssafy.welog.service;

import com.ssafy.welog.api.controller.dto.AuthDto.LoginReqDto;
import com.ssafy.welog.api.controller.dto.AuthDto.LoginResDto;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AuthService {

    public LoginResDto login(LoginReqDto loginReqDto) {
        log.info("로그인");
        return LoginResDto.builder()
//            .sessionId(UUID.randomUUID().toString())
            .sessionId("1234")
            .build();
    }

    public void logout() {
        log.info("로그아웃");
        return;
    }
}
