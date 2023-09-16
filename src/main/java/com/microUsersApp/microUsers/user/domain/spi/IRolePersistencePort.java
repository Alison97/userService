package com.microUsersApp.microUsers.user.domain.spi;

import com.microUsersApp.microUsers.user.domain.model.Role;

import java.util.List;

public interface IRolePersistencePort {
    void saveRole(Role role);
    Role getRoles(Long roleId);
    List<Role> getAllRoles();
    void updateRole(Role role);
    void deleteRole(Long roleId);
}
