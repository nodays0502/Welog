package com.ssafy.welog.domain.repository;

import com.ssafy.welog.domain.entity.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BoardRepositoryCustom {
    List<Board> getByContent(String searchWord);
    List<Board> getByTitle(String searchWord);
    List<Board> getByCategory(String searchWord);
}
