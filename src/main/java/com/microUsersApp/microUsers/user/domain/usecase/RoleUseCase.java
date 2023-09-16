package com.microUsersApp.microUsers.user.domain.usecase;

import com.microUsersApp.microUsers.user.domain.api.IRoleServicePort;
import com.microUsersApp.microUsers.user.domain.model.Role;
import com.microUsersApp.microUsers.user.domain.spi.IRolePersistencePort;

import java.util.List;
public class RoleUseCase implements IRoleServicePort {

    private final IRolePersistencePort rolePersistencePort;

    public RoleUseCase(IRolePersistencePort rolePersistencePort) {
        this.rolePersistencePort = rolePersistencePort;
    }


    @Override
    public void saveRole(Role role) { rolePersistencePort.saveRole(role);
    }

    @Override
    public Role getRole(Long roleId) {
        return rolePersistencePort.getRoles(roleId);
    }

    @Override
    public List<Role> getAllRoles() {
        return rolePersistencePort.getAllRoles();
    }

    @Override
    public void updateRole(Role role) {
        rolePersistencePort.updateRole(role);
    }

    @Override
    public void deleteRole(Long roleId) {
        rolePersistencePort.deleteRole(roleId);
    }
}
