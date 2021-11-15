package com.ssafy.welog.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFeel is a Querydsl query type for Feel
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFeel extends EntityPathBase<Feel> {

    private static final long serialVersionUID = -234821082L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFeel feel = new QFeel("feel");

    public final QComment comment;

    public final EnumPath<com.ssafy.welog.domain.common.Feeling> feeling = createEnum("feeling", com.ssafy.welog.domain.common.Feeling.class);

    public final QUser user;

    public final NumberPath<Long> userCommentId = createNumber("userCommentId", Long.class);

    public QFeel(String variable) {
        this(Feel.class, forVariable(variable), INITS);
    }

    public QFeel(Path<? extends Feel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFeel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFeel(PathMetadata metadata, PathInits inits) {
        this(Feel.class, metadata, inits);
    }

    public QFeel(Class<? extends Feel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.comment = inits.isInitialized("comment") ? new QComment(forProperty("comment"), inits.get("comment")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

