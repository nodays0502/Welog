package com.ssafy.welog.domain.repository;


import com.querydsl.jpa.impl.JPAQueryFactory;
import com.ssafy.welog.domain.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.ssafy.welog.domain.entity.QComment.comment;

@Repository
public class CommentRepositoryImpl implements CommentRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;

    public CommentRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    public List<Comment> getByBoardId(Long boardId){
        return jpaQueryFactory.select(comment).from(comment).where(comment.board.boardId.eq(boardId)).fetch();
    }

}
