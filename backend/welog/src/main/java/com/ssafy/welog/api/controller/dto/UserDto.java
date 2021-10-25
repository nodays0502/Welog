package com.ssafy.welog.api.controller.dto;

import com.ssafy.welog.domain.users.common.AuthLevel;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class UserDto {

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class UserInfoDto {

        private String email;
        private String nickname;
        private String phone;
        private AuthLevel userLevel;

        @Builder
        public UserInfoDto(String email, String nickname, String phone,
            AuthLevel userLevel) {
            this.email = email;
            this.nickname = nickname;
            this.phone = phone;
            this.userLevel = userLevel;
        }
    }
}
