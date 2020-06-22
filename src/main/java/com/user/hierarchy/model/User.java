package com.user.hierarchy.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "T_USER")
@Entity
@Getter @Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "EMP_ID", nullable = false)
    private String empId;

    @Column(name = "ACCESS_KEY", nullable = false)
    private String accessKey;

    @Column(name = "COUNTRY", nullable = false)
    private String country;

}
