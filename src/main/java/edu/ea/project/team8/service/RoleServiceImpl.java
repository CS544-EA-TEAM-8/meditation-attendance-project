package edu.ea.project.team8.service;

import edu.ea.project.team8.common.service.BaseServiceImpl;
import edu.ea.project.team8.domain.Role;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("roleService")
@Transactional(propagation = Propagation.REQUIRED)
public class RoleServiceImpl extends BaseServiceImpl<Role, Role, Integer> implements RoleService {

    @Override
    protected List<Role> convertToResponseList(List<Role> list) {
        return list;
    }
}
