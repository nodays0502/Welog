package com.ssafy.welog.domain.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ssafy.welog.domain.common.Feeling;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
public class Feel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userCommentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id")
    private Comment comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private Feeling feeling;

    public Feel() {
    }

    @Builder
    public Feel(Long userCommentId, Comment comment, User user, Feeling feeling) {
        this.userCommentId = userCommentId;
        this.comment = comment;
        this.user = user;
        this.feeling = feeling;
    }

    public void change(Feeling feeling) {
        if (feeling != null) {
            this.feeling = feeling;
        }
    }
}
