package com.ssafy.welog.entity;

import com.ssafy.welog.domain.users.common.AuthLevel;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String userEmail;

    @JoinColumn(name = "role_name")
    @Enumerated(EnumType.STRING)
    private AuthLevel userRole;

    public User() {
    }

    @Builder
    public User(Long userId, String userName, String userEmail, AuthLevel userRole) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userRole = userRole;
    }
}
