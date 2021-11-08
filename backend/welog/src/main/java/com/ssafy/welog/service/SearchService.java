package com.ssafy.welog.service;

import com.ssafy.welog.domain.entity.RecommendWord;
import com.ssafy.welog.domain.repository.BoardRepository;
import com.ssafy.welog.domain.repository.RecommendWordRepository;
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
    private final RecommendWordRepository recommendWordRepository;

    public SearchService(BoardRepository boardRepository,
                         RecommendWordRepository recommendWordRepository) {
        this.boardRepository = boardRepository;
        this.recommendWordRepository = recommendWordRepository;
    }

    List<Object> data;

    // object로 처리하고 후에 수정
    public Object search(SearchReqDto param){
        System.out.println("param = " + param);
        addRecommendWordCnt(param);
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

    private void addRecommendWordCnt(SearchReqDto param) {
        RecommendWord prevRecommendWord = recommendWordRepository.getByWord(param.getSearchWord());
        if(prevRecommendWord == null) {
            recommendWordRepository.save(RecommendWord.builder()
                    .word(param.getSearchWord())
                    .cnt(1l)
                    .build());
        } else {
            recommendWordRepository.save(RecommendWord.builder()
                    .recommendWordId(prevRecommendWord.getRecommendWordId())
                    .word(param.getSearchWord())
                    .cnt(prevRecommendWord.getCnt() + 1)
                    .build());
        }
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
