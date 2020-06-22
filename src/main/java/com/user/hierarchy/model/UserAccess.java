package com.user.hierarchy.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "UserAccess")
@Entity
@Getter @Setter
public class UserAccess {

    private Long id;

    private String empId;

    private String accessKey;

    private String country;

    private String subUser;

    private String subUserAccessKey;

    private String subUserCountry;

}
