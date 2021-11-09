package com.ssafy.welog.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRecommendWord is a Querydsl query type for RecommendWord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRecommendWord extends EntityPathBase<RecommendWord> {

    private static final long serialVersionUID = -1883465370L;

    public static final QRecommendWord recommendWord = new QRecommendWord("recommendWord");

    public final NumberPath<Long> cnt = createNumber("cnt", Long.class);

    public final NumberPath<Long> recommendWordId = createNumber("recommendWordId", Long.class);

    public final StringPath word = createString("word");

    public QRecommendWord(String variable) {
        super(RecommendWord.class, forVariable(variable));
    }

    public QRecommendWord(Path<? extends RecommendWord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRecommendWord(PathMetadata metadata) {
        super(RecommendWord.class, metadata);
    }

}

