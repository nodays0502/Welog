package com.ssafy.welog.entity;

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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_name")
    private Role userRole;

    public User() {
    }

    @Builder
    public User(Long userId, String userName, String userEmail, Role userRole) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userRole = userRole;
    }
}
