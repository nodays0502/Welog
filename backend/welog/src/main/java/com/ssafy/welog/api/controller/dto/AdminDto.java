package com.ssafy.welog.api.controller.dto;

import com.ssafy.welog.domain.common.AuthLevel;
import java.util.List;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class AdminDto {

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class UserChangeReqDto {
        @Email
        private String userEmail;

        @NotBlank
        private AuthLevel authLevel;

        @Builder
        public UserChangeReqDto(String userEmail, AuthLevel authLevel) {
            this.userEmail = userEmail;
            this.authLevel = authLevel;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SearchAllUserResDto {

        private List<SeachUserDto> userList;

        @Builder
        public SearchAllUserResDto(List<SeachUserDto> userList) {
            this.userList = userList;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SeachUserDto {

        private Long userId;
        private String userName;
        private String userEmail;
        private AuthLevel authLevel;

        @Builder
        public SeachUserDto(Long userId, String userName, String userEmail,
            AuthLevel authLevel) {
            this.userId = userId;
            this.userName = userName;
            this.userEmail = userEmail;
            this.authLevel = authLevel;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class BoardRollBackReqDto {
        @NotNull
        private Long boardId;

        @NotBlank
        private String version;

        @Builder
        public BoardRollBackReqDto(Long boardId, String version) {
            this.boardId = boardId;
            this.version = version;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class BoardRollBackResDto {

        private String version;
        private String content;

        @Builder
        public BoardRollBackResDto(String version, String content) {
            this.version = version;
            this.content = content;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @ToString
    public static class ChangeBoardReqDto {
        @NotNull
        private Long boardId;

        @NotBlank
        private AuthLevel authLevel;

        @Builder
        public ChangeBoardReqDto(Long boardId, AuthLevel authLevel) {
            this.boardId = boardId;
            this.authLevel = authLevel;
        }
    }
}
