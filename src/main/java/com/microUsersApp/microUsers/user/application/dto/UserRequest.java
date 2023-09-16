package com.microUsersApp.microUsers.user.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserRequest {

    private String name;
    private String lastName;
    private String identificationNumber;
    private Boolean status;
    private Date dateOfBirth;
    private String phone;
    private String email;
    private String password;
    private Long roleId;
}
