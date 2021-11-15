package com.ssafy.welog.api.controller.dto;

import com.ssafy.welog.domain.common.AuthLevel;
import java.util.List;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class UserDto {

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class UserInfoDto {
        private String email;
        private String userName;
        private AuthLevel userLevel;

        @Builder
        public UserInfoDto(String email, String userName,
            AuthLevel userLevel) {
            this.email = email;
            this.userName = userName;
            this.userLevel = userLevel;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @ToString
    public static class UserCreateReqDto{

        @NotBlank
        private String userName;
        @Email
        private String userEmail;
        @NotBlank
        private String password;

        @NotBlank
        private AuthLevel userRole;

        @Builder
        public UserCreateReqDto( String userName, String userEmail, String password,
            AuthLevel userRole) {
            this.userName = userName;
            this.userEmail = userEmail;
            this.password = password;
            this.userRole = userRole;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class UserPutReqDto{

        private String userEmail;
        private String password;
        private AuthLevel userRole;

        @Builder
        public UserPutReqDto( String userName, String userEmail, String password,
            AuthLevel userRole) {
            this.userEmail = userEmail;
            this.password = password;
            this.userRole = userRole;
        }
    }
    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class UserListResDto{

        private List<String> userNames;

        @Builder
        public UserListResDto(List<String> userNames) {
            this.userNames = userNames;
        }
    }
}
