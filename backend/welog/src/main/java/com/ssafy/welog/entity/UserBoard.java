package com.ssafy.welog.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class UserBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_board_id")
    private Long userBoardId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    public UserBoard() {
    }
    @Builder
    public UserBoard(Long userBoardId, User user, Board board) {
        this.userBoardId = userBoardId;
        this.user = user;
        this.board = board;
    }

}
