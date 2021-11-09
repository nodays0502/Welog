package com.ssafy.welog.domain.repository;

import java.util.Optional;

import com.ssafy.welog.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUserName(String username);

    boolean existsByUserName(String username);

    Optional<User> findByUserEmail(String userEmail);
    
    void deleteByUserEmail(String userEmail);

    boolean existsByUserEmail(String userEmail);
}
