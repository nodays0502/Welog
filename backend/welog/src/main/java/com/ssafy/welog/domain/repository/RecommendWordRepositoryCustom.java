package com.ssafy.welog.domain.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecommendWordRepositoryCustom {
    List<String> getRecommendWords(String word);
}
