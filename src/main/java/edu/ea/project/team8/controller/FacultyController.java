package edu.ea.project.team8.controller;

import edu.ea.project.team8.domain.Course;
import edu.ea.project.team8.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class FacultyController {

//    @Autowired
//    FacultyService facultyService;

//    @GetMapping("/faculty/{id}/courses")
//    Course getCourseFacultyTeaching(@PathVariable Integer id) {
//        return facultyService.getCourseNowTeaching(id, LocalDate.now());
//    }

//    @GetMapping("/faculty/{id}/courseList")
//    List<Course> getCourseFacultyTeachingSixMonth(@PathVariable Integer id) {
//        return facultyService.courseFromSixMonths(id, LocalDate.now());
//    }
}
