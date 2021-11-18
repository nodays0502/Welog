package com.ssafy.welog.domain.repository;

import com.ssafy.welog.domain.entity.Board;
import com.ssafy.welog.domain.entity.Favorite;
import com.ssafy.welog.domain.entity.User;

import java.util.List;

public interface FavoriteRepositoryCustom {
    List<Favorite> getFavoriteList(User user);
    void deleteFavorite(User user, Board board);
    Favorite checkFavorite(User user, Board board);
}
