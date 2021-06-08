package edu.ea.project.team8.service;

import edu.ea.project.team8.domain.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAllRoles();

    Role findRoleById(Integer id);

    void addRole(Role role);

    void deleteRole(Integer id);

    void updateRole(Role role);
}
