package com.ssafy.welog.domain.entity;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
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
    public UserBoard(User user, Board board) {
        this.user = user;
        this.board = board;
        user.addUserBoard(this);
        board.addUserBoard(this);
    }
    public void deleteUserBoard(){
        Set<UserBoard> userBoardByUser = this.user.getUserBoards();
        Set<UserBoard> userBoardsByBoard = this.board.getUserBoards();
        userBoardByUser.remove(this);
        userBoardsByBoard.remove(this);
    }

}
