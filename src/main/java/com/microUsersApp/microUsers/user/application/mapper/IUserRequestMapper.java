package com.microUsersApp.microUsers.user.application.mapper;

import com.microUsersApp.microUsers.user.application.dto.UserRequest;
import com.microUsersApp.microUsers.user.domain.model.Role;
import com.microUsersApp.microUsers.user.domain.model.User;

public interface IUserRequestMapper {
    default User toUser(UserRequest userRequest){
        User user = new User();
        user.setName(userRequest.getName());
        user.setLastName(userRequest.getLastName());
        user.setStatus(userRequest.getStatus());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setPhone(userRequest.getPhone());
        user.setDateOfBirth(userRequest.getDateOfBirth());
        user.setRoleId(userRequest.getRoleId());

        return user;
    };

    default Role toRole(UserRequest userRequest){
        Role role = new Role();
        role.setId(userRequest.getRoleId());
        return role;
    }


}
