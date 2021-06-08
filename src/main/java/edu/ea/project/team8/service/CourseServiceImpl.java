package edu.ea.project.team8.service;

import java.util.List;

import edu.ea.project.team8.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.ea.project.team8.domain.Course;


@Service("courseService")
@Transactional(propagation=Propagation.REQUIRED)
public class CourseServiceImpl implements CourseService {

	private CourseRepository courseRepository;

	@Autowired
	public CourseServiceImpl(CourseRepository repository) {
		this.courseRepository = repository;
	}

	@Override
	public List<Course> findAll() {
		return courseRepository.findAll();
	}

	@Override
	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	@Override
	public Course getCourseById(Integer id) {
		return courseRepository.getById(id);
	}

	@Override
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	@Override
	public void deleteCourse(Integer id) {
		courseRepository.deleteById(id);
	}

}
