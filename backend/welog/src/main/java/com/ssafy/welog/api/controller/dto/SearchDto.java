package com.ssafy.welog.api.controller.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class SearchDto {

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SearchReqDto {
        private Integer page;
        @NotNull
        private String searchType;
        @NotBlank
        private String searchWord;

        @Builder
        public SearchReqDto(Integer page, String searchType, String searchWord) {
            this.page = page;
            this.searchType = searchType;
            this.searchWord = searchWord;
        }

        @Override
        public String toString() {
            return "SearchReqDto{" +
                    "page=" + page +
                    ", searchType='" + searchType + '\'' +
                    ", searchWord='" + searchWord + '\'' +
                    '}';
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SearchResDto<T> {
        private List<T> data = new ArrayList<>();

        @Builder
        public SearchResDto(List<T> data) {
            this.data = data;
        }
    }
}
