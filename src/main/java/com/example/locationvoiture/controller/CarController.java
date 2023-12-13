package com.example.locationvoiture.controller;


import com.example.locationvoiture.entity.Car;
import com.example.locationvoiture.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cars")
@RestController
@RequiredArgsConstructor

public class CarController {

    private final CarService carService;

    @GetMapping
    public List<Car> getAllCars() {
        return carService.findAll();
    }
    @GetMapping ("/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }
    @PostMapping
    public Car createCar(@RequestBody Car car) {
        return carService.createCar(car);
    }
    @PutMapping ("/{id}")
    public Car updateCar(@PathVariable Long id, @RequestBody Car updatedCar) {
        return carService.updateCar(id, updatedCar);
    }
    @DeleteMapping ("/{id}")
    public boolean deleteCar(@PathVariable Long id) {
        return carService.deleteCar(id);
    }





}
