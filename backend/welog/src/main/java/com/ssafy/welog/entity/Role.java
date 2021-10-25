package com.ssafy.welog.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Role {
    @Id
    private String roleName;

    public Role() {
    }

    @Builder
    public Role(String roleName) {
        this.roleName = roleName;
    }

}
