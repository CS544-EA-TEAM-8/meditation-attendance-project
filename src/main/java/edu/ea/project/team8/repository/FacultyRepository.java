package edu.ea.project.team8.repository;

import edu.ea.project.team8.domain.Course;
import edu.ea.project.team8.domain.CourseOffering;
import edu.ea.project.team8.domain.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

@Repository("faculityRepository")
@Transactional(propagation=Propagation.MANDATORY)
public interface FacultyRepository extends JpaRepository<Faculty, Integer> {



    @Query("SELECT f from Faculty f where f.id = :id ")
    List<Faculty> getFacultyById(@Param("id")Integer id);
//minus 6 month
    @Query("select co.course from CourseOffering co join Faculty f where co.faculty.id = :id and co.beginDate >:d")
    List<Course> getCourseOfferingBeforeSixMonth(@Param("id")Integer id, @Param("d")LocalDate date);

    @Query("select co.course from CourseOffering co join Faculty  f where co.faculty.id = :id and co.beginDate > :d and co.endDate < :d")
    Course getCourseOfferingNowTeaching(@Param("id")Integer id, @Param("d")LocalDate date);



}
