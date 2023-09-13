package com.microUsersApp.microUsers.user.domain.api;

import com.microUsersApp.microUsers.user.domain.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleServicePort extends JpaRepository<Role,Long> {

}
