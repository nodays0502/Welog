package com.ssafy.welog.api.controller.dto;

import com.ssafy.welog.entity.Feeling;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDateTime;
import java.util.List;

public class BoardDto {

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class AddBoardReqDto {

        private Long boardId;
        private String content;
        private String title;
        private String version;
        private String category;

        @Builder
        public AddBoardReqDto(Long boardId, String content, String title, String version, String category) {
            this.boardId = boardId;
            this.content = content;
            this.title = title;
            this.version = version;
            this.category = category;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PUBLIC)
    public static class SearchBoardResDto {
        private List<SearchBoardDto> boardList;

        @Builder
        public SearchBoardResDto(List<SearchBoardDto> boardList) {
            this.boardList = boardList;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PUBLIC)
    public static class SearchBoardDto{

        private Long boardId;
        private String content;
        private LocalDateTime registerTime;

        @Builder
        public SearchBoardDto(Long boardId, String content, LocalDateTime registerTime) {
            this.boardId = boardId;
            this.content = content;
            this.registerTime = registerTime;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class ChangeBoardReqDto {
        private Long boardId;
        private String content;
        private LocalDateTime registerTime;

        @Builder
        public ChangeBoardReqDto(Long boardId, String content, LocalDateTime registerTime) {
            this.boardId = boardId;
            this.content = content;
            this.registerTime = registerTime;
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
