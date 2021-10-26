package com.ssafy.welog.service;

import com.ssafy.welog.api.controller.dto.SearchReqDto;
import com.ssafy.welog.api.controller.dto.SearchResDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SearchService {

    public SearchResDto search(SearchReqDto param){
        log.info(String.format("%s 검색", param.getSearchType()));
        return SearchResDto.builder().build();
    }

    public SearchResDto searchRecommendWords(SearchReqDto param) {
        log.info("추천 자동완성 검색");
        return SearchResDto.builder().build();
    }
}
