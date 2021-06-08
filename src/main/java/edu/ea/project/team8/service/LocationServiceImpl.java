package edu.ea.project.team8.service;

import java.util.List;

import edu.ea.project.team8.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.ea.project.team8.domain.Location;


@Service("locationService")
@Transactional(propagation=Propagation.REQUIRED)
public class LocationServiceImpl implements LocationService {

	private LocationRepository locationRepository;


	@Override
	public List<Location> getAllLocation() {
		return locationRepository.findAll();
	}

	@Override
	public Location findLocationById(Integer id) {
		return locationRepository.getById(id);
	}

	@Override
	public void addLocation(Location location) {
		locationRepository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public void deleteLocation(Integer id) {
		locationRepository.deleteById(id);

	}
}
