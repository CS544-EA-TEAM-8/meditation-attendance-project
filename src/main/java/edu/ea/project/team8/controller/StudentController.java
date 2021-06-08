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
    public Student getStudent(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/addStudent")
    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

    @DeleteMapping("/deleteStudent")
    public void deleteStudent(Integer id) {
        studentService.deleteStudent(id);
    }

    @GetMapping("students/courses")
    public List<Course> findAllCoursesTaken(Integer id) {
        return studentService.findAllCoursesTaken(id);
    }

    @GetMapping("student/availableCourses")
    public List<Course> findAllCourse(Integer id) {
        return studentService.findAllCourse(id);
    }

    @GetMapping("students/coursesTillNow/")
    public List<Course> findAllCoursesTaking(Integer id) {
        return studentService.findAllCoursesTaking(id);
    }

    @PutMapping("/updateStudent")
    public void updateStudent(Student student) {
        studentService.updateStudent(student);
    }
}
