package com.microUsersApp.microUsers.user.domain.api;

import com.microUsersApp.microUsers.user.domain.model.Role;

import java.util.List;

public interface IRoleServicePort {

    void saveRole(Role role);
    Role getRole(Long roleId);
    List<Role> getAllRoles();
    void updateRole(Role role);
    void deleteRole(Long roleId);
}
