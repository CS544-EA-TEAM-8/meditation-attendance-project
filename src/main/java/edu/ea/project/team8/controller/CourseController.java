package edu.ea.project.team8.controller;

import edu.ea.project.team8.domain.Course;
import edu.ea.project.team8.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getAllCourse() {
        return courseService.findAll();
    }

    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable Integer id) {
        return courseService.getCourseById(id);
    }

    @PostMapping("/addCourse")
    public void addCourse(Course course) {
        courseService.addCourse(course);
    }

    @DeleteMapping("/deleteCourse")
    public void deleteCourse(Integer id) {
        courseService.deleteCourse(id);
    }

    @PutMapping("/updateCourse")
    public void updateCourse(Course course) {
        courseService.updateCourse(course);
    }
}
