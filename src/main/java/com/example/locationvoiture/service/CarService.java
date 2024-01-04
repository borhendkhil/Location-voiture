package com.example.locationvoiture.service;

import com.example.locationvoiture.entity.Car;
import com.example.locationvoiture.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car createCar(Car car) {
        return carRepository.save(car);
    }
    public Car updateCar(Long id, Car updatedCar) {
        if (carRepository.existsById(id)) {
            updatedCar.setId(id);
            return carRepository.save(updatedCar);
        }
        return null;
    }
    public boolean deleteCar(Long id) {
        if (carRepository.existsById(id)) {
            carRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }


    public Optional<Car> getCar(Long id) {
        return carRepository.findById(id);
    }
}
