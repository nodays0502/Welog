package com.ssafy.welog.domain.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long commentId;
    @Column(length = 1000)
    private String content;
    private LocalDateTime registerTime;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id")
    private Comment comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


    public Comment() {
    }

    @Builder
    public Comment(String content, LocalDateTime registerTime, Comment comment, Board board, User user) {
        this.content = content;
        this.registerTime = registerTime;
        this.comment = comment;
        this.board = board;
        this.user = user;
    }
}
