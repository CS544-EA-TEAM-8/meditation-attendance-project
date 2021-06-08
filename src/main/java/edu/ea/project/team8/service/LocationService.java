package edu.ea.project.team8.service;

import java.util.List;

import edu.ea.project.team8.domain.Faculty;
import edu.ea.project.team8.domain.Location;

public interface LocationService {
	List<Location> getAllLocation();
	Location findLocationById(Integer id);
	void addLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation (Integer id);
}
