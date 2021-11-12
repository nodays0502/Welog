package com.ssafy.welog.domain.entity;

import com.ssafy.welog.domain.common.AuthLevel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import lombok.ToString;
import org.hibernate.annotations.Fetch;

@Entity
@Getter
@Table(uniqueConstraints = {
        @UniqueConstraint(
                columnNames = {"user_name","user_email"}
        )
})
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(name = "user_name", nullable = false)
    private String userName;
    @Column(name = "user_email", nullable = false)
    private String userEmail;
    private String password;

    @JoinColumn(name = "role_name")
    @Enumerated(EnumType.STRING)
    private AuthLevel userRole;

//    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
//    private Set<UserBoard> userBoards;
//
//    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
//    private List<UserComment> userComments;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<UserBoard> userBoards;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<UserComment> userComments;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
            "userId=" + userId +
            ", userName='" + userName + '\'' +
            ", userEmail='" + userEmail + '\'' +
            ", password='" + password + '\'' +
            ", userRole=" + userRole +
            '}';
    }

    @Builder
    public User(Long userId, String userName, String userEmail,String password, AuthLevel userRole) {
        this.userBoards = new LinkedHashSet<>();
        this.userComments = new ArrayList<>();
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.password = password;
        this.userRole = userRole;
    }
    public void changeInfo(String userEmail,String password,AuthLevel userRole){
        if(userEmail != null){
            this.userEmail = userEmail;
        }
        if(password != null){
            this.password = password;
        }
        if(userRole != null){
            this.userRole = userRole;
        }
    }
    public void addUserBoard(UserBoard userBoard){
        this.userBoards.add(userBoard);
    }
}
