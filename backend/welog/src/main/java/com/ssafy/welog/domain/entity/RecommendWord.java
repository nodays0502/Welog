package com.ssafy.welog.domain.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class RecommendWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recommendWordId;
    @Column(nullable = false)
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
