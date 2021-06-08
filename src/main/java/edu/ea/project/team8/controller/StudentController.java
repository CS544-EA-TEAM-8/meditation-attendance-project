package edu.ea.project.team8.controller;

import edu.ea.project.team8.domain.Course;
import edu.ea.project.team8.domain.Student;
import edu.ea.project.team8.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;


    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return studentService.findAll();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") Integer id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable("id") Integer id) {
        studentService.deleteStudent(id);
    }

    @GetMapping("students/{id}/course")
    public List<Course> findAllCoursesTaken(@PathVariable("id") Integer id) {
        return studentService.findAllCoursesTaken(id);
    }

    @GetMapping("students/{id}/courses")
    public List<Course> findAllCourseTaken(@PathVariable("id") Integer id) {
        return studentService.findAllCourse(id);
    }

    @GetMapping("student/{id}/courses")
    public List<Course> findAllCoursesTaking(@PathVariable("id") Integer id) {
        return studentService.findAllCoursesTaking(id);
    }

    @PutMapping("/students")
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }
}
