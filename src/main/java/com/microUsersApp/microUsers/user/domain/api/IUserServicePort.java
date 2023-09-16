package com.microUsersApp.microUsers.user.domain.api;

import com.microUsersApp.microUsers.user.domain.model.User;

import java.util.List;

public interface IUserServicePort {

    void saveUser(User user);
    User getUser(Long userId);
    List<User> getAllUsers();
    void updateUser(User user);
    void disableUser(Long userId);

}
