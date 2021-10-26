package com.ssafy.welog.entity;

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

    public Comment() {
    }

    @Builder

    public Comment(Long commentId, String content, LocalDateTime registerTime, Comment comment, Board board) {
        this.commentId = commentId;
        this.content = content;
        this.registerTime = registerTime;
        this.comment = comment;
        this.board = board;
    }
}
