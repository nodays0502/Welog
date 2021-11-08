package com.ssafy.welog.domain.repository;

import com.ssafy.welog.domain.entity.RecommendWord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendWordRepository extends JpaRepository<RecommendWord, Long> {
    RecommendWord getByWord(String word);
}
