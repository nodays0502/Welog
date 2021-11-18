package com.ssafy.welog.api.controller;

import com.ssafy.welog.domain.entity.Favorite;
import com.ssafy.welog.domain.entity.User;
import com.ssafy.welog.service.FavoriteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.ssafy.welog.common.util.constants.ResponseConstants.OK;

@Slf4j
@RestController
@RequestMapping("/api/favorite")
public class FavoriteApiController {
    private final FavoriteService favoriteService;

    public FavoriteApiController(FavoriteService favoriteService) {
        this.favoriteService = favoriteService;
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<Void> addFavorite(@AuthenticationPrincipal User user, @RequestBody Map<String, Long> params){
        favoriteService.addFavorite(user, params.get("boardId"));
        return OK;
    }
    @DeleteMapping
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<Void> deleteFavorite(@AuthenticationPrincipal User user, @RequestBody Map<String, Long> params){
        favoriteService.deleteFavorite(user, params.get("boardId"));
        return OK;
    }
    @GetMapping("/{boardId}")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<Boolean> checkFavorite(@AuthenticationPrincipal User user, @PathVariable Long boardId){
        Favorite favorite = favoriteService.checkFavorite(user, boardId);
        Boolean isFavorite;
        if (favorite == null){
            isFavorite = Boolean.FALSE;
        } else {
            isFavorite = Boolean.TRUE;
        }
        return ResponseEntity.ok(isFavorite);
    }
    @GetMapping
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<List<Long>> getFavoriteList(@AuthenticationPrincipal User user){
        List<Favorite> favoriteList = favoriteService.getFavoriteList(user);
        List<Long> results = new ArrayList<>();
        for (Favorite favorite : favoriteList) {
            results.add(favorite.getFavoriteId().getBoard().getBoardId());
        }
        return ResponseEntity.ok(results);
    }
}
