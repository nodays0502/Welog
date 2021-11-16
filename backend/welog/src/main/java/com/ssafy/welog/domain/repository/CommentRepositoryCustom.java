package com.ssafy.welog.domain.repository;

import com.ssafy.welog.domain.entity.Comment;

import java.util.List;

public interface CommentRepositoryCustom {
    List<Comment> getByBoardId(Long boardId);
}
