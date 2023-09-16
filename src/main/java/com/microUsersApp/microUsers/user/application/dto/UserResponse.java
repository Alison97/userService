package com.microUsersApp.microUsers.user.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class UserResponse {

        private Long id;
        private String name;
        private String lastName;
        private String identificationNumber;
        private Boolean status;
        private Date dateOfBirth;
        private String phone;
        private String email;
        private RoleDto role;
}
