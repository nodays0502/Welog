package com.ssafy.welog.domain.common;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFavoriteId is a Querydsl query type for FavoriteId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QFavoriteId extends BeanPath<FavoriteId> {

    private static final long serialVersionUID = 267756879L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFavoriteId favoriteId = new QFavoriteId("favoriteId");

    public final com.ssafy.welog.domain.entity.QBoard board;

    public final com.ssafy.welog.domain.entity.QUser user;

    public QFavoriteId(String variable) {
        this(FavoriteId.class, forVariable(variable), INITS);
    }

    public QFavoriteId(Path<? extends FavoriteId> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFavoriteId(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFavoriteId(PathMetadata metadata, PathInits inits) {
        this(FavoriteId.class, metadata, inits);
    }

    public QFavoriteId(Class<? extends FavoriteId> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new com.ssafy.welog.domain.entity.QBoard(forProperty("board")) : null;
        this.user = inits.isInitialized("user") ? new com.ssafy.welog.domain.entity.QUser(forProperty("user")) : null;
    }

}

