package com.ssafy.welog.domain.repository;

import com.ssafy.welog.domain.entity.Feel;
import com.ssafy.welog.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FeelingRepository extends JpaRepository<Feel,Long>, FeelingRepositoryCustom {
}
