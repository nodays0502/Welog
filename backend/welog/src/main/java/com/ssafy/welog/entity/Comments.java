package com.ssafy.welog.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comments_id")
    private Long commentsId;
    @Column(length = 1000)
    private String content;
    private LocalDateTime registerTime;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comments_id")
    private Comments comments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    public Comments() {
    }

    @Builder
    public Comments(Long commentsId, String content, LocalDateTime registerTime, Comments comments, Board board) {
        this.commentsId = commentsId;
        this.content = content;
        this.registerTime = registerTime;
        this.comments = comments;
        this.board = board;
    }
}
