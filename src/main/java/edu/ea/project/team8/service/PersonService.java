package edu.ea.project.team8.service;

import edu.ea.project.team8.common.service.BaseService;
import edu.ea.project.team8.domain.Person;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface PersonService extends UserDetailsService, BaseService<Person, Person, Integer> {

}
