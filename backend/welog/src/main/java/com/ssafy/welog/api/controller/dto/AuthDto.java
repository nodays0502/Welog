package com.ssafy.welog.api.controller.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class AuthDto {
    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class LoginReqDto {

        private String userEmail;
        private String password;

        @Builder
        public LoginReqDto(String userEmail, String password) {
            this.userEmail = userEmail;
            this.password = password;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class LoginResDto {

        private String sessionId;

        @Builder
        public LoginResDto(String sessionId) {
            this.sessionId = sessionId;
        }
    }

}
