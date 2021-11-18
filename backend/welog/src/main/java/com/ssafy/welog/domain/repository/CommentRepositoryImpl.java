package com.ssafy.welog.domain.repository;


import com.querydsl.jpa.impl.JPAQueryFactory;
import com.ssafy.welog.domain.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.ssafy.welog.domain.entity.QComment.comment1;

@Repository
public class CommentRepositoryImpl implements CommentRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;

    public CommentRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }
    public List<Comment> getByBoardId(Long boardId){
        return jpaQueryFactory.select(comment1).from(comment1).where(comment1.board.boardId.eq(boardId)).fetch();
    }

}
