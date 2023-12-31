package com.microUsersApp.microUsers.user.domain.usecase;

import com.microUsersApp.microUsers.user.domain.api.IUserServicePort;
import com.microUsersApp.microUsers.user.domain.model.User;
import com.microUsersApp.microUsers.user.domain.spi.IUserPersistencePort;

import java.util.List;

public class UserUseCase implements IUserServicePort {

    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public void saveUser(User user) {
        userPersistencePort.saveUser(user);
    }

    @Override
    public User getUser(Long userId) {
        return userPersistencePort.getUser(userId);
    }

    @Override
    public List<User> getAllUsers() {
        return userPersistencePort.getAllUsers();
    }

    @Override
    public void updateUser(User user) {
        userPersistencePort.updateUser(user);
    }

    @Override
    public void disableUser(Long userId) {
        userPersistencePort.disableUser(userId);
    }
}
