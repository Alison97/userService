package com.microUsersApp.microUsers.user.application.handler;

import com.microUsersApp.microUsers.user.application.dto.UserRequest;
import com.microUsersApp.microUsers.user.application.dto.UserResponse;

import java.util.List;

public interface IUserHandler {

    void saveUserInUser(UserRequest userRequest);
    List<UserResponse> getAllUserFromUser();
    UserResponse getUserFromUser(Long id);

    void updateUserInUser(UserRequest userRequest);

    void disableUserFromUser(Long id);
}
