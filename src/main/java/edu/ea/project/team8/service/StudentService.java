package edu.ea.project.team8.service;

import java.util.List;

import edu.ea.project.team8.domain.Course;
import edu.ea.project.team8.domain.Student;

public interface StudentService {
    List<Student> findAll();

    List<Course> findAllCourse(Integer id);

    List<Course> findAllCoursesTaking(Integer id);

    List<Course> findAllCoursesTaken(Integer id);

    void addStudent(Student student);

    Student getStudentById(Integer id);

    void updateStudent(Student student);

    void deleteStudent(Integer id);
}
