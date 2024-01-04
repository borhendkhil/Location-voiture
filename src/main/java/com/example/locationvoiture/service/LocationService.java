package com.example.locationvoiture.service;

import com.example.locationvoiture.entity.Location;
import com.example.locationvoiture.repository.LocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public void saveLocation(Location location) {
        locationRepository.save(location);
    }
    
    public List<Location> getAllLocation() {
        return locationRepository.findAll();
    }


}
