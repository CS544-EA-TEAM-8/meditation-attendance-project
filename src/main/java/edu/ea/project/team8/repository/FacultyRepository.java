package edu.ea.project.team8.repository;

import edu.ea.project.team8.domain.Course;
import edu.ea.project.team8.domain.Faculty;
import edu.ea.project.team8.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Repository("facultyRepository")
@Transactional(propagation = Propagation.MANDATORY)
public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

    @Query("select co.course from CourseOffering co where co.faculty.id =:id and co.beginDate > :date and co.endDate < :date ")
    Course getCourseOfferingNowTeaching(@Param("id") Integer id, @Param("date") LocalDate date);

    @Query("select co.course from CourseOffering co  where co.faculty.id =:id and co.beginDate > :dt")
    List<Course> getCourseOfferingBeforeSixMonth(@Param("id") Integer id, @Param("dt") LocalDate date);

//returns the list of student that are registered in the class, now we need to add the list of attendance of each student to this
//    @Query("select r.student from Registration r join CourseOffering co where co.faculty.id = :id and co.beginDate > :d and co.endDate < :d ")
//    List<Student> getAllStudentsTakingCourseOffering(Integer id, LocalDate date);

}
