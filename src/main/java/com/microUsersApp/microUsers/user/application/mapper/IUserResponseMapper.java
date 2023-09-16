package com.microUsersApp.microUsers.user.application.mapper;

import com.microUsersApp.microUsers.user.application.dto.RoleDto;
import com.microUsersApp.microUsers.user.application.dto.UserResponse;
import com.microUsersApp.microUsers.user.domain.model.Role;
import com.microUsersApp.microUsers.user.domain.model.User;

import java.util.List;

public interface IUserResponseMapper {
    default UserResponse toResponse(User user, RoleDto roleDto){
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setName(user.getName());
        userResponse.setEmail(user.getEmail());
        userResponse.setLastName(user.getLastName());
        userResponse.setPhone(user.getPhone());
        userResponse.setDateOfBirth(user.getDateOfBirth());
        userResponse.setIdentificationNumber(user.getIdentificationNumber());
        userResponse.setStatus(user.getStatus());
        userResponse.setRole(roleDto);
        return userResponse;
    }
    default List<UserResponse> toResponseList(List<User> userList, List<Role> roleList){
        return userList.stream()
                .map(user -> {
                    UserResponse userResponse = new UserResponse();
                    userResponse.setId(user.getId());
                    userResponse.setName(user.getName());
                    userResponse.setEmail(user.getEmail());
                    userResponse.setLastName(user.getLastName());
                    userResponse.setPhone(user.getPhone());
                    userResponse.setDateOfBirth(user.getDateOfBirth());
                    userResponse.setIdentificationNumber(user.getIdentificationNumber());
                    userResponse.setStatus(user.getStatus());
                    userResponse.setRole(RoleDtoMapper.toDto(roleList.stream().filter(role-> role.getId().equals(user.getId())).findFirst().orElse(null)));
                    return userResponse;
                }).toList();
    }
}
