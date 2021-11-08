package com.ssafy.welog.domain.repository;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;

import java.util.List;

import static com.ssafy.welog.domain.entity.QRecommendWord.recommendWord;

public class RecommendWordRepositoryImpl implements RecommendWordRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    public RecommendWordRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    public List<String> getRecommendWords(String word){
        return jpaQueryFactory.select(recommendWord.word).from(recommendWord).where(wordIn(word))
                .orderBy(recommendWord.cnt.asc()).limit(15).fetch();
    }
    private BooleanExpression wordIn(String word) {
        return word == null ? null : recommendWord.word.in(word);
    }
}
