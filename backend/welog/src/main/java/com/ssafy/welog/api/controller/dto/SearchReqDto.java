package com.ssafy.welog.api.controller.dto;

import lombok.Builder;
import lombok.Getter;

// req, res dto 나눌껀지, 합칠지 팀원이랑 상의해보기
@Getter
public class SearchReqDto {
    private Integer page;
    private String searchType;
    private String searchWord;

    public SearchReqDto() {
    }

    @Builder
    public SearchReqDto(Integer page, String searchType, String searchWord) {
        this.page = page;
        this.searchType = searchType;
        this.searchWord = searchWord;
    }
}
