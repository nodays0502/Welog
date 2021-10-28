package com.ssafy.welog.api.controller.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class SearchResDto {
    private List<SearchDto> data = new ArrayList<>();

    public SearchResDto() {
    }

    @Builder
    public SearchResDto(List<SearchDto> data) {
        this.data = data;
    }
}
