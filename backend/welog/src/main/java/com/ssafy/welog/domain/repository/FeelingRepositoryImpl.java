package com.ssafy.welog.domain.repository;


import com.querydsl.jpa.impl.JPAQueryFactory;
import com.ssafy.welog.domain.common.Feeling;
import com.ssafy.welog.domain.entity.Comment;
import com.ssafy.welog.domain.entity.Feel;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.ssafy.welog.domain.entity.QComment.comment1;
import static com.ssafy.welog.domain.entity.QFeel.feel;

@Repository
public class FeelingRepositoryImpl implements FeelingRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;

    public FeelingRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<Feel> getByCommentIdAndUserId(Long commentId, Long userId) {
        return jpaQueryFactory.select(feel).from(feel).where(feel.comment.commentId.eq(commentId), feel.user.userId.eq(userId)).fetch();
    }
}
