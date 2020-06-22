package com.user.hierarchy.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "User")
@Entity
@Getter @Setter
public class User {

    private Long id;

    private String empId;

    private String accessKey;

    private String country;

}
