package com.ssafy.welog.api.controller.dto;

import com.ssafy.welog.domain.users.common.AuthLevel;
import java.util.List;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class AdminDto {

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class UserChangeReqDto {

        private Long userId;
        private AuthLevel authLevel;

        @Builder
        public UserChangeReqDto(Long userId, AuthLevel authLevel) {
            this.userId = userId;
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

        private Long boardId;
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
    public static class ChangeBoardReqDto {

        private Long boardId;
        private AuthLevel Auth;

        @Builder
        public ChangeBoardReqDto(Long boardId, AuthLevel auth) {
            this.boardId = boardId;
            Auth = auth;
        }
    }
}
