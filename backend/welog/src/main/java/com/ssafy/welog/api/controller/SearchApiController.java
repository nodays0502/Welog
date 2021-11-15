package com.ssafy.welog.api.controller;

import com.ssafy.welog.api.controller.dto.SearchDto;
import com.ssafy.welog.service.SearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.ssafy.welog.api.controller.dto.SearchDto.*;


@Slf4j
@RestController
@RequestMapping("/api/search")
public class SearchApiController {
    private final SearchService searchService;

    public SearchApiController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping
    public ResponseEntity<Object> search(SearchReqDto param){
        return ResponseEntity.ok(searchService.search(param));
    }

    @GetMapping("/recommend")
    public ResponseEntity<Object> searchRecommendWords(SearchReqDto param){
        return ResponseEntity.ok(searchService.searchRecommendWords(param));
    }
}
