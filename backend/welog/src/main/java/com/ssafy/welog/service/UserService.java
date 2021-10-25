package com.ssafy.welog.service;


import com.ssafy.welog.api.controller.dto.UserDto.UserInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    public void deleteUser() {
        log.info("유저 삭제");
    }

    public void createUser() {
        log.info("회원 가입");
    }

    public void putUser() {
        log.info("회원정보변경");
    }

    public UserInfoDto getUser(String email) {
        log.info("회원정보 얻기");
        return UserInfoDto.builder()
            .phone("000-0000-0000")
            .email("이메일")
            .nickname("닉네임")
            .build();
    }
}
