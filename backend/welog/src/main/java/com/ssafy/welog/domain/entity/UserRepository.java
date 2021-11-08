package com.ssafy.welog.domain.entity;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUserName(String username);

    boolean existsByUserName(String username);

    Optional<User> findByUserEmail(String userEmail);
}
