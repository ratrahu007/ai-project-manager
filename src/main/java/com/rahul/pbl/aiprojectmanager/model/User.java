package com.rahul.pbl.aiprojectmanager.model;

import com.rahul.pbl.aiprojectmanager.model.base.BaseEntity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import com.rahul.pbl.aiprojectmanager.model.enums.Role;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;
}
