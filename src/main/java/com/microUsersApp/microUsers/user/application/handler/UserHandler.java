package com.microUsersApp.microUsers.user.application.handler;

import com.microUsersApp.microUsers.user.application.dto.RoleDto;
import com.microUsersApp.microUsers.user.application.dto.UserRequest;
import com.microUsersApp.microUsers.user.application.dto.UserResponse;
import com.microUsersApp.microUsers.user.application.mapper.IUserRequestMapper;
import com.microUsersApp.microUsers.user.application.mapper.IUserResponseMapper;
import com.microUsersApp.microUsers.user.application.mapper.RoleDtoMapper;
import com.microUsersApp.microUsers.user.domain.api.IRoleServicePort;
import com.microUsersApp.microUsers.user.domain.api.IUserServicePort;
import com.microUsersApp.microUsers.user.domain.model.Role;
import com.microUsersApp.microUsers.user.domain.model.User;

import java.util.List;


public class UserHandler implements IUserHandler{

    private final IUserServicePort userServicePort;
    private final IRoleServicePort roleServicePort;
    private final IUserRequestMapper userRequestMapper;
    private final IUserResponseMapper userResponseMapper;
    private final RoleDtoMapper roleDtoMapper;

    public UserHandler(IUserServicePort userServicePort, IRoleServicePort roleServicePort, IUserRequestMapper userRequestMapper, IUserResponseMapper userResponseMapper, RoleDtoMapper roleDtoMapper) {
        this.userServicePort = userServicePort;
        this.roleServicePort = roleServicePort;
        this.userRequestMapper = userRequestMapper;
        this.userResponseMapper = userResponseMapper;
        this.roleDtoMapper = roleDtoMapper;
    }

    @Override
    public void saveUserInUser(UserRequest userRequest) {
        User user = userRequestMapper.toUser(userRequest);
        userServicePort.saveUser(user);
    }

    @Override
    public List<UserResponse> getAllUserFromUser() {
        List<User> userList = userServicePort.getAllUsers();
        List<Role>  roleList = roleServicePort.getAllRoles();
        List<UserResponse> userResponseList = userResponseMapper.toResponseList(userList,roleList);
        return userResponseList;
    }

    @Override
    public UserResponse getUserFromUser(Long id) {
        User user = userServicePort.getUser(id);
        Role role = roleServicePort.getRole(user.getRoleId());
        RoleDto roleDto = roleDtoMapper.toDto(role);
        UserResponse userResponse = userResponseMapper.toResponse(user, roleDto);
        return userResponse;
    }

    @Override
    public void updateUserInUser(UserRequest userRequest) {
        User user = userRequestMapper.toUser(userRequest);
        userServicePort.updateUser(user);
    }

    @Override
    public void disableUserFromUser(Long id) {
        User user = userServicePort.getUser(id);
        user.setStatus(false);
        userServicePort.saveUser(user);
    }
}
