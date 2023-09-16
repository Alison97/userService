package com.microUsersApp.microUsers.user.domain.spi;

import com.microUsersApp.microUsers.user.domain.model.User;

import java.util.List;

public interface IUserPersistencePort {
    void saveUser(User user);
    User getUser(Long userId);
    List<User> getAllUsers();
    void updateUser(User user);
    void disableUser(Long userId);
}
