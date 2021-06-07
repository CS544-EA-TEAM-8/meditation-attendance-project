package edu.ea.project.team8.controller;

import edu.ea.project.team8.service.CourseService;
import edu.ea.project.team8.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacultyController {

    @Autowired
    FacultyService facultyService;

    @Autowired
    CourseService courseService;

//    @GetMapping("/faculty/")
//    List<Course> courseList (Integer id){
//        Faculty faculty = facultyService.;
//        Course course = courseService.getCourseById(id);
//        Faculty faculty = facultyService.getCourseNowTeaching(course.getId(), LocalDate.now());
//    }



}
