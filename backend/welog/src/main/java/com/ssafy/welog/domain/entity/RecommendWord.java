package com.ssafy.welog.domain.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity
public class RecommendWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recommendWordId;
    private String word;
    private Long cnt;

    public RecommendWord() {
    }

    @Builder
    public RecommendWord(Long recommendWordId, String word, Long cnt) {
        this.recommendWordId = recommendWordId;
        this.word = word;
        this.cnt = cnt;
    }
}
