package com.example.casestudy.service.role;

import com.example.casestudy.model.Role;
import com.example.casestudy.model.dto.RoleDTO;
import com.example.casestudy.service.IGeneralService;

import java.util.List;

public interface IRoleService<Role> extends IGeneralService<Role> {
    com.example.casestudy.model.Role save(com.example.casestudy.model.Role role);

    Role findByName(String name);

    List<RoleDTO> getAllRole();

    void softDelete(com.example.casestudy.model.Role role);
}
