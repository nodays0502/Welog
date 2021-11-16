package com.ssafy.welog.domain.entity;

import com.ssafy.welog.domain.common.FavoriteId;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Getter
@Entity
public class Favorite {
    @EmbeddedId
    private FavoriteId favoriteId;

    public Favorite() {
    }

    @Builder
    public Favorite(FavoriteId favoriteId) {
        this.favoriteId = favoriteId;
    }
}
