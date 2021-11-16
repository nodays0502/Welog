package com.ssafy.welog.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.ssafy.welog.domain.common.AuthLevel;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;
    @Column(nullable = false)
    private String title;
    private String version;
    private String category;
    @Enumerated(EnumType.STRING)
    private AuthLevel authLevel;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime registerTime;

    @OneToMany(mappedBy = "board", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<UserBoard> userBoards;


    public Board() {
    }

    @Builder
    public Board(String content, String title, String version, String category,
        AuthLevel authLevel) {
        this.userBoards = new LinkedHashSet<>();
        this.content = content;
        this.title = title;
        this.version = version;
        this.category = category;
        this.authLevel = authLevel;
        this.registerTime = LocalDateTime.now();
    }

    public void addUserBoard(UserBoard userBoard) {
        this.userBoards.add(userBoard);
    }
    public void changeAuth(AuthLevel authLevel){
        this.authLevel = authLevel;
    }
    public void change(String title, String content, String version) {
        if (title != null) {
            this.title = title;
        }
        if (content != null) {
            this.content = content;
        }
        if (version != null) {
            this.version = version;
        }

    }
}
