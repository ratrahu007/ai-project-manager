package com.rahul.pbl.aiprojectmanager.model;



import com.rahul.pbl.aiprojectmanager.model.base.BaseEntity;
import com.rahul.pbl.aiprojectmanager.model.enums.DecisionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "faculty_decisions")
@Getter
@Setter
public class FacultyDecision extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idea_id", nullable = false)
    private ProjectIdea projectIdea;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "faculty_id", nullable = false)
    private User faculty;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DecisionType decision;

    @Column(length = 1000)
    private String comment;
}
