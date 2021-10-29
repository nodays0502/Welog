package com.ssafy.welog.service;

import com.ssafy.welog.api.controller.dto.BoardDto;
import com.ssafy.welog.api.controller.dto.SearchDto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.ssafy.welog.api.controller.dto.BoardDto.*;
import static com.ssafy.welog.api.controller.dto.SearchDto.*;

@Slf4j
@Service
public class SearchService {
    List<Object> data;
    public SearchResDto search(SearchReqDto param){
        data = new ArrayList<>();
        log.info(String.format("%s 검색", param.getSearchType()));
        data.add(SearchBoardDto.builder()
                .boardId(1L)
                .content("내용")
                .registerTime(LocalDateTime.now())
            .build());
        data.add(SearchBoardDto.builder()
            .boardId(2L)
            .content("내용2")
            .registerTime(LocalDateTime.now())
            .build());
        return SearchResDto.builder()
            .data(data)
            .build();
    }

    public SearchResDto searchRecommendWords(SearchReqDto param) {
        log.info("추천 자동완성 검색");
        data = new ArrayList<>();
        data.add(SearchBoardDto.builder()
                .boardId(1L)
                .content("내용")
                .registerTime(LocalDateTime.now())
            .build());
        data.add(SearchBoardDto.builder()
            .boardId(2L)
            .content("내용2")
            .registerTime(LocalDateTime.now())
            .build());
        return SearchResDto.builder()
            .data(data)
            .build();
    }
}
