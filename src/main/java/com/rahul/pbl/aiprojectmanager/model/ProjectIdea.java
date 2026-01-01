package com.rahul.pbl.aiprojectmanager.model;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import com.rahul.pbl.aiprojectmanager.model.base.BaseEntity;
import com.rahul.pbl.aiprojectmanager.model.enums.IdeaStatus;

@Entity
@Table(name = "project_ideas")
@Getter
@Setter
public class ProjectIdea extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, length = 2000)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private IdeaStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private User student;
}

