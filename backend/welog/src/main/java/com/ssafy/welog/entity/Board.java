package com.ssafy.welog.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;
    @Column(columnDefinition = "TEXT")
    private String content;
    private String title;
    private String version;
    private String category;

    public Board() {
    }

    @Builder
    public Board(Long boardId, String content, String title, String version, String category) {
        this.boardId = boardId;
        this.content = content;
        this.title = title;
        this.version = version;
        this.category = category;
    }
}
