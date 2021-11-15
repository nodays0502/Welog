package com.ssafy.welog.api.controller.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class AuthDto {
    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class LoginReqDto {
        @Email
        private String userEmail;

        @NotBlank
        private String password;

        @Builder
        public LoginReqDto(String userEmail, String password) {
            this.userEmail = userEmail;
            this.password = password;
        }
    }

}
