package com.user.hierarchy.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TeamHierarchy")
@Entity
@Getter@Setter
public class TeamHierarchy {

    private Long id;

    private String empId;

    private String managerId;

}
