package edu.ea.project.team8.service;

import java.util.List;

import edu.ea.project.team8.domain.CourseOffering;

public interface CourseOfferingService {
	public List<CourseOffering> getAllCourseOffering();
	public CourseOffering getCourseOfferingById(Integer id);
	public void deleteCourseOffering(Integer id);
	public void addCourseOffering(CourseOffering courseOffering);
	public CourseOffering updateCourseOffering(CourseOffering courseOffering);
}
