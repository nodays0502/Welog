package com.ssafy.welog.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoard is a Querydsl query type for Board
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBoard extends EntityPathBase<Board> {

    private static final long serialVersionUID = 1307081318L;

    public static final QBoard board = new QBoard("board");

    public final EnumPath<com.ssafy.welog.domain.common.AuthLevel> authLevel = createEnum("authLevel", com.ssafy.welog.domain.common.AuthLevel.class);

    public final NumberPath<Long> boardId = createNumber("boardId", Long.class);

    public final StringPath category = createString("category");

    public final StringPath content = createString("content");

    public final DateTimePath<java.time.LocalDateTime> registerTime = createDateTime("registerTime", java.time.LocalDateTime.class);

    public final StringPath title = createString("title");

    public final SetPath<UserBoard, QUserBoard> userBoards = this.<UserBoard, QUserBoard>createSet("userBoards", UserBoard.class, QUserBoard.class, PathInits.DIRECT2);

    public final StringPath version = createString("version");

    public QBoard(String variable) {
        super(Board.class, forVariable(variable));
    }

    public QBoard(Path<? extends Board> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoard(PathMetadata metadata) {
        super(Board.class, metadata);
    }

}

