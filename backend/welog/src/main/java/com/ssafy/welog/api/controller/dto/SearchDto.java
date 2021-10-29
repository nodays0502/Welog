package com.ssafy.welog.api.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class SearchDto {

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SearchReqDto {
        private Integer page;
        private String searchType;
        private String searchWord;

        @Builder
        public SearchReqDto(Integer page, String searchType, String searchWord) {
            this.page = page;
            this.searchType = searchType;
            this.searchWord = searchWord;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SearchResDto {
        private List<Object> data = new ArrayList<>();

        @Builder
        public SearchResDto(List<Object> data) {
            this.data = data;
        }
    }
}
