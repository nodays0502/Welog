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
    @NoArgsConstructor(access = AccessLevel.PUBLIC)
    public static class SearchAllUserReqDto {

        private List<SeachUserDto> userList;

        @Builder
        public SearchAllUserReqDto(List<SeachUserDto> userList) {
            this.userList = userList;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PUBLIC)
    public static class SeachUserDto {

        private Long userId;
        private String userName;
        private String userEmail;
        private AuthLevel authLevel;
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PUBLIC)
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
}
