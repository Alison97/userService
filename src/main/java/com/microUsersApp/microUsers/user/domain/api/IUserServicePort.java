package com.microUsersApp.microUsers.user.domain.api;

import com.microUsersApp.microUsers.user.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserServicePort extends JpaRepository<User,Long> {

}
