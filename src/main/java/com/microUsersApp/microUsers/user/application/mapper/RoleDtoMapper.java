package com.microUsersApp.microUsers.user.application.mapper;

import com.microUsersApp.microUsers.user.application.dto.RoleDto;
import com.microUsersApp.microUsers.user.domain.model.Role;

public class RoleDtoMapper {
    public static RoleDto toDto(Role role){
        RoleDto roleDto = new RoleDto();
        roleDto.setName(role.getRole());
        return roleDto;
    }
}
