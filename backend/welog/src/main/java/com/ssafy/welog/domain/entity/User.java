package com.ssafy.welog.domain.entity;

import com.ssafy.welog.domain.common.AuthLevel;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import lombok.ToString;

@Entity
@Getter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String userEmail;
    private String password;

    @JoinColumn(name = "role_name")
    @Enumerated(EnumType.STRING)
    private AuthLevel userRole;

    public User() {
    }

    @Builder
    public User(Long userId, String userName, String userEmail,String password, AuthLevel userRole) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.password = password;
        this.userRole = userRole;
    }
}
