package edu.ea.project.team8.controller;


import edu.ea.project.team8.domain.Role;
import edu.ea.project.team8.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    RoleService roleService;


    @GetMapping("/roles")
    public List<Role> getAllRoles() {
        return roleService.findAllRoles();
    }

    @GetMapping("/roles/{id}")
    public Role getRole(@PathVariable("id") Integer id) {

        return roleService.findRoleById(id);
    }

    @PostMapping("/roles")
    public void addRole(@RequestBody Role role) {
        roleService.addRole(role);
    }

    @DeleteMapping("/roles/{id}")
    public void deleteRole(@PathVariable("id") Integer id) {
        roleService.deleteRole(id);
    }

    @PutMapping("/roles")
    public void updateRole(@RequestBody Role role) {
        roleService.updateRole(role);
    }

}
