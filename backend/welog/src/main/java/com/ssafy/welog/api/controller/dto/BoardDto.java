package com.ssafy.welog.api.controller.dto;

import com.ssafy.welog.domain.common.AuthLevel;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

public class BoardDto {

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)//인자가 없는 객체를 만들었을때
    @ToString
    public static class AddBoardReqDto {
        @NotBlank
        private String content;
        @NotBlank
        private String title;
        @NotBlank
        private String version;

        private String category;

        @NotNull
        private AuthLevel authLevel;

        @Builder
        public AddBoardReqDto(String content, String title, String version, String category,
            AuthLevel authLevel) {
            this.content = content;
            this.title = title;
            this.version = version;
            this.category = category;
            this.authLevel = authLevel;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SearchBoardResDto {

        private List<SearchBoardDto> boardList;

        @Builder
        public SearchBoardResDto(List<SearchBoardDto> boardList) {
            this.boardList = boardList;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SearchBoardDto {

        private Long boardId;
        private String content;
        private String title;
        private String version;
        private String category;
        private LocalDateTime registerTime;
        private AuthLevel auth;

        @Builder
        public SearchBoardDto(Long boardId, String content, String title, String version,
            String category, LocalDateTime registerTime, AuthLevel auth) {
            this.boardId = boardId;
            this.content = content;
            this.title = title;
            this.version = version;
            this.category = category;
            this.registerTime = registerTime;
            this.auth = auth;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @ToString
    public static class ChangeBoardReqDto {

        private Long boardId;
        private String title;
        private String content;
        private String category;
        private String version;

        @Builder
        public ChangeBoardReqDto(Long boardId, String title, String category, String content, String version) {
            this.boardId = boardId;
            this.title = title;
            this.category = category;
            this.content = content;
            this.version = version;
        }
    }


    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class PageDto {

        private Integer page;

        @Builder
        public PageDto(Integer page) {
            this.page = page;
        }
    }


}
