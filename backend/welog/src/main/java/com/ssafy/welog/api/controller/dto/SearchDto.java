package com.ssafy.welog.api.controller.dto;

import java.time.LocalDateTime;
import lombok.Builder;

public class SearchDto {
    private Long boardId;
    private String content;
    private LocalDateTime registerTime;

    @Builder
    public SearchDto(Long boardId, String content, LocalDateTime registerTime) {
        this.boardId = boardId;
        this.content = content;
        this.registerTime = registerTime;
    }
}
