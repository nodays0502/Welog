package com.ssafy.welog.domain.repository;

import com.ssafy.welog.domain.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long>, CommentRepositoryCustom {

}
