package com.ssafy.welog.service;

import com.ssafy.welog.domain.common.FavoriteId;
import com.ssafy.welog.domain.entity.Board;
import com.ssafy.welog.domain.entity.Favorite;
import com.ssafy.welog.domain.entity.User;
import com.ssafy.welog.domain.repository.BoardRepository;
import com.ssafy.welog.domain.repository.FavoriteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class FavoriteService {

    private final BoardRepository boardRepository;
    private final FavoriteRepository favoriteRepository;

    public FavoriteService(BoardRepository boardRepository, FavoriteRepository favoriteRepository) {
        this.boardRepository = boardRepository;
        this.favoriteRepository = favoriteRepository;
    }

    public void addFavorite(User user, Long boardId) {
        favoriteRepository.save(Favorite.builder()
                .favoriteId(FavoriteId.builder().board(getBoard(boardId)).user(user).build())
                .build());
    }


    @Transactional
    public void deleteFavorite(User user, Long boardId) {
        favoriteRepository.deleteFavorite(user, getBoard(boardId));
    }

    public Favorite checkFavorite(User user, Long boardId) {
        return favoriteRepository.checkFavorite(user, getBoard(boardId));
    }

    public List<Favorite> getFavoriteList(User user) {
        return favoriteRepository.getFavoriteList(user);
    }

    private Board getBoard(Long boardId) {
        return boardRepository.getById(boardId);
    }
}
