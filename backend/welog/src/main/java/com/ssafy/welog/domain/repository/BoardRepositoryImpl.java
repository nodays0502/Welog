package com.ssafy.welog.domain.repository;


import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.ssafy.welog.domain.entity.Board;
import com.ssafy.welog.domain.entity.QBoard;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.ssafy.welog.domain.entity.QBoard.*;

@Repository
public class BoardRepositoryImpl implements BoardRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;

    public BoardRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    public List<Board> getByContent(String searchWord){
        return jpaQueryFactory.select(board).from(board).where(contentIn(searchWord)).fetch();
    }
    public List<Board> getByTitle(String searchWord){
        return jpaQueryFactory.select(board).from(board).where(titleIn(searchWord)).fetch();
    }
    public List<Board> getByCategory(String searchWord){
        return jpaQueryFactory.select(board).from(board).where(categoryIn(searchWord)).fetch();
    }

    private BooleanExpression contentIn(String searchWord) {
        return searchWord == null ? null : board.content.in(searchWord);
    }
    private BooleanExpression titleIn(String searchWord) {
        return searchWord == null ? null : board.title.in(searchWord);
    }
    private BooleanExpression categoryIn(String searchWord) {
        return searchWord == null ? null : board.category.in(searchWord);
    }

}
