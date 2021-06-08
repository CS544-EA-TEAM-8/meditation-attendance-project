package edu.ea.project.team8.service;

import java.time.LocalDate;
import java.util.List;

import edu.ea.project.team8.domain.Course;
import edu.ea.project.team8.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.ea.project.team8.domain.Student;


@Service("studentService")
@Transactional(propagation = Propagation.REQUIRED)
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository repository) {
        this.studentRepository = repository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    //list of course the faculty can see, id is of faculty.
    @Override
    public List<Course> findAllCourse(Integer id) {
        return studentRepository.findAllCourses(id);
    }

    @Override
    public List<Course> findAllCoursesTaking(Integer id) {
        return studentRepository.findAllCoursesTaking(id, LocalDate.now());
    }

    @Override
    public List<Course> findAllCoursesTaken(Integer id) {
        return studentRepository.findAllCoursesTakenBefore(id, LocalDate.now());
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.getById(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }


}
