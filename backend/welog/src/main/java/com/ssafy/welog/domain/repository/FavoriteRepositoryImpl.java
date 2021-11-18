package com.ssafy.welog.domain.repository;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.ssafy.welog.domain.entity.Board;
import com.ssafy.welog.domain.entity.Favorite;
import com.ssafy.welog.domain.entity.QFavorite;
import com.ssafy.welog.domain.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.ssafy.welog.domain.entity.QBoard.board;
import static com.ssafy.welog.domain.entity.QFavorite.*;

@Repository
public class FavoriteRepositoryImpl implements FavoriteRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;

    public FavoriteRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<Favorite> getFavoriteList(User user) {
        return jpaQueryFactory.selectFrom(favorite).where(userEq(user)).fetch();
    }
    @Override
    public void deleteFavorite(User user, Board board){
        jpaQueryFactory.delete(favorite).where(userEq(user), boardEq(board)).execute();
    }
    @Override
    public Favorite checkFavorite(User user, Board board){
        return jpaQueryFactory.selectFrom(favorite).where(userEq(user), boardEq(board)).fetchOne();
    }

    private BooleanExpression userEq(User user) {
        return user == null ? null : favorite.favoriteId.user.eq(user);
    }
    private BooleanExpression boardEq(Board board) {
        return board == null ? null : favorite.favoriteId.board.eq(board);
    }
}
