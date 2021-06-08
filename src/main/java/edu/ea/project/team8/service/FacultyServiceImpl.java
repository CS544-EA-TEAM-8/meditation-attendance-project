package edu.ea.project.team8.service;

import edu.ea.project.team8.domain.Course;
import edu.ea.project.team8.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {

    @Qualifier("facultyRepository")
    @Autowired
    FacultyRepository facultyRepository;


    @Override
    public Course getCourseNowTeaching(Integer id, LocalDate localDate) {
        return facultyRepository.getCourseOfferingNowTeaching(id, LocalDate.now());
    }

    @Override
    public List<Course> courseFromSixMonths(Integer id, LocalDate date) {
        return facultyRepository.getCourseOfferingBeforeSixMonth(id, LocalDate.now().minusMonths(6));
    }


}
