package edu.ea.project.team8.service;

import edu.ea.project.team8.domain.Course;


import java.time.LocalDate;
import java.util.List;


public interface FacultyService {
    Course getCourseNowTeaching(Integer id, LocalDate date);

    List<Course> courseFromSixMonths(Integer id, LocalDate date);

}
