package com.user.hierarchy.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "T_TEAM_HIERARCHY")
@Entity
@Getter@Setter
public class TeamHierarchy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "EMP_ID", nullable = false)
    private String empId;

    @Column(name = "MANAGER_ID", nullable = false)
    private String managerId;

}
