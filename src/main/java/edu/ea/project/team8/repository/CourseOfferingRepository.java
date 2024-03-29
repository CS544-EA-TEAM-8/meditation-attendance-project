package edu.ea.project.team8.repository;

import edu.ea.project.team8.domain.CourseOffering;
import edu.ea.project.team8.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Repository("courseOfferingRepository")
@Transactional(propagation=Propagation.MANDATORY)
public interface CourseOfferingRepository extends JpaRepository<CourseOffering, Integer> {

	@Query("SELECT cof from CourseOffering cof WHERE cof.course.id = :cid")
	List<CourseOffering> findByCourse(@Param("cid") Integer cid);

	@Query("SELECT cof from CourseOffering cof WHERE cof.faculty.id = :fid and cof.endDate > :after")
	List<CourseOffering> findAfterByFaculty(@Param("fid") Integer fid, @Param("after") LocalDate after);

	@Query("SELECT cof from CourseOffering cof WHERE cof.faculty.id = :fid")
	List<CourseOffering> findAllByFaculty(Integer fid);

	@Query("SELECT cof from CourseOffering cof join cof.registrations rg WHERE rg.student.id = :sid and cof.endDate > :after")
	List<CourseOffering> findAfterByStudent(@Param("sid") Integer sid, @Param("after") LocalDate after);

	@Query("SELECT cof from CourseOffering cof left join Registration rg on cof.id = rg.offering.id and rg.student.id = :sid WHERE rg.student.id = null and cof.endDate > :after")
	List<CourseOffering> findNotRegisteredByStudent(@Param("sid") Integer sid, @Param("after") LocalDate after);

	@Query("SELECT rg.student from CourseOffering cof join cof.registrations rg WHERE cof.id = :coid")
	List<Student> getStudents(@Param("coid") Integer coid);
}
