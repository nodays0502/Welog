package com.ssafy.welog.service;

import com.ssafy.welog.api.controller.dto.SearchDto;
import com.ssafy.welog.api.controller.dto.SearchReqDto;
import com.ssafy.welog.api.controller.dto.SearchResDto;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SearchService {

    public SearchResDto search(SearchReqDto param){
        log.info(String.format("%s 검색", param.getSearchType()));
        List<SearchDto> data = new ArrayList();
        data.add(SearchDto.builder()
                .boardId(1L)
                .content("내용")
                .registerTime(LocalDateTime.now())
            .build());
        data.add(SearchDto.builder()
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
        List<SearchDto> data = new ArrayList();
        data.add(SearchDto.builder()
            .boardId(1L)
            .content("내용")
            .registerTime(LocalDateTime.now())
            .build());
        data.add(SearchDto.builder()
            .boardId(2L)
            .content("내용2")
            .registerTime(LocalDateTime.now())
            .build());
        return SearchResDto.builder()
            .data(data)
            .build();
    }
}
