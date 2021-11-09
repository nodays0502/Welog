package com.ssafy.welog.domain.repository;


import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.ssafy.welog.domain.entity.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.ssafy.welog.domain.entity.QBoard.board;

@Repository
public class BoardRepositoryImpl implements BoardRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;

    public BoardRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    public List<Board> getByContent(String searchWord){
        return jpaQueryFactory.select(board).from(board).where(contentContains(searchWord)).fetch();
    }
    public List<Board> getByTitle(String searchWord){
        return jpaQueryFactory.select(board).from(board).where(titleContains(searchWord)).fetch();
    }
    public List<Board> getByCategory(String searchWord){
        return jpaQueryFactory.select(board).from(board).where(categoryContains(searchWord)).fetch();
    }

    private BooleanExpression contentContains(String searchWord) {
        return searchWord == null ? null : board.content.contains(searchWord);
    }
    private BooleanExpression titleContains(String searchWord) {
        return searchWord == null ? null : board.title.contains(searchWord);
    }
    private BooleanExpression categoryContains(String searchWord) {
        return searchWord == null ? null : board.category.contains(searchWord);
    }

}
