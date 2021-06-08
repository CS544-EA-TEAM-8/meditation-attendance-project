package edu.ea.project.team8.service;

import java.util.List;

import edu.ea.project.team8.repository.CourseOfferingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.ea.project.team8.domain.CourseOffering;


@Service("courseOfferingService")
@Transactional(propagation=Propagation.REQUIRED)
public class CourseOfferingServiceImpl implements CourseOfferingService {

	private CourseOfferingRepository courseOfferingRepository;

	@Autowired
	public CourseOfferingServiceImpl(CourseOfferingRepository courseOfferingRepository) {
		this.courseOfferingRepository = courseOfferingRepository;
	}

	@Override
	public List<CourseOffering> getAllCourseOffering() {
		return courseOfferingRepository.findAll();
	}

	@Override
	public CourseOffering getCourseOfferingById(Integer id) {
		return courseOfferingRepository.getById(id);
	}

	@Override
	public void deleteCourseOffering(Integer id) {
		courseOfferingRepository.deleteById(id);
	}

	@Override
	public void addCourseOffering(CourseOffering offering) {

		courseOfferingRepository.save(offering);
	}

	@Override
	public CourseOffering updateCourseOffering(CourseOffering courseOffering) {
		return courseOfferingRepository.save(courseOffering);
	}

}
