package edu.ea.project.team8.repository;

import edu.ea.project.team8.domain.Course;
import edu.ea.project.team8.domain.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Repository("faculityRepository")
@Transactional(propagation=Propagation.MANDATORY)
public interface FacultyRepository extends JpaRepository<Faculty,Integer> {

    @Query("select co.course from CourseOffering co join co.faculty f where f.id =:id and co.beginDate >:d and co.endDate < :d ")
    Course getCourseFacultyTeachingNow(@Param("id") Integer id, @Param("d")LocalDate d );

    //Six months
    @Query("select co.course from CourseOffering co  join co.faculty f where f.id =:id and co.beginDate >:dt")
    List <Course> getCourseFacultyTeachingPastSixMonths(@Param("id") Integer id, @Param("dt")LocalDate dt );


}
