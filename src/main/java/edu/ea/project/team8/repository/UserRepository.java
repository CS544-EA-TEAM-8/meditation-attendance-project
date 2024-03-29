package edu.ea.project.team8.repository;

import edu.ea.project.team8.domain.Timeslot;
import edu.ea.project.team8.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository("userRepository")
@Transactional(propagation= Propagation.MANDATORY)
public interface UserRepository extends JpaRepository<User, Integer> {
}
