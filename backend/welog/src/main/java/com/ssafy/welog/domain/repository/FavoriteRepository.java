package com.ssafy.welog.domain.repository;

import com.ssafy.welog.domain.common.FavoriteId;
import com.ssafy.welog.domain.entity.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId>, FavoriteRepositoryCustom {
    @Override
    Favorite getById(FavoriteId favoriteId);
}
