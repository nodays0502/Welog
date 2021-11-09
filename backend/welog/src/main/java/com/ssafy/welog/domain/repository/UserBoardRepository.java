package com.ssafy.welog.domain.repository;

import com.ssafy.welog.domain.entity.Board;
import com.ssafy.welog.domain.entity.User;
import com.ssafy.welog.domain.entity.UserBoard;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserBoardRepository extends JpaRepository<UserBoard, Long> {

    boolean existsByUserAndBoard(User user , Board board);

//    @Query("select u from User u join u.userBoards ub where ub.board = :board")
//    List<User> findByBoard(@Param("board") Board board);
//
//    @Query("select b from Board b join b.userBoards ub where ub.user = :user")
//    List<Board> findByUser(@Param("user") User user);

}
