package com.ssafy.welog.service;

import com.ssafy.welog.domain.repository.BoardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.ssafy.welog.api.controller.dto.SearchDto.SearchReqDto;
import static com.ssafy.welog.api.controller.dto.SearchDto.SearchResDto;

@Slf4j
@Service
public class SearchService {
    private final BoardRepository boardRepository;

    public SearchService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }
    List<Object> data;

    // object로 처리하고 후에 수정
    public Object search(SearchReqDto param){
        switch (param.getSearchType()){
            case "content":
                return boardRepository.getByContent(param.getSearchWord());
            case "title":
                return boardRepository.getByTitle(param.getSearchWord());
            case "category":
                return boardRepository.getByCategory(param.getSearchWord());
        }
        return null;
    }

    public SearchResDto searchRecommendWords(SearchReqDto param) {
        log.info("추천 자동완성 검색");
        data = new ArrayList<>();
        data.add("추천어");
        data.add("추천어 검색");
        data.add("추천어 자동 검색");
        return SearchResDto.builder()
            .data(data)
            .build();
    }
}
