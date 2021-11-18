package com.ssafy.welog.api.controller.dto;

import com.ssafy.welog.domain.common.AuthLevel;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
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

        private Long userId;
        private String userName;
        private String userEmail;
        private AuthLevel userRole;

        @Builder
        public LoginResDto(Long userId, String userName, String userEmail,
            AuthLevel userRole) {
            this.userId = userId;
            this.userName = userName;
            this.userEmail = userEmail;
            this.userRole = userRole;
        }
    }
}
