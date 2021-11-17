package com.ssafy.welog.domain.repository;

import com.ssafy.welog.domain.common.Feeling;
import com.ssafy.welog.domain.entity.Comment;
import com.ssafy.welog.domain.entity.Feel;

import java.util.List;

public interface FeelingRepositoryCustom {
    List<Feel> getByCommentIdAndUserId(Long commentId, Long userId);
}
