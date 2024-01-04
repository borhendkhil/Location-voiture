package com.example.locationvoiture.controller;


import com.example.locationvoiture.entity.Car;
import com.example.locationvoiture.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping
    public String carManagement(Model model) {
        List<Car> cars = carService.findAll();
        model.addAttribute("cars", cars);
        model.addAttribute("car", new Car());
        return "carManagement";
    }

    @GetMapping("/{id}")
    public String getCarById(@PathVariable Long id, Model model) {
        Car car = carService.getCarById(id);
        model.addAttribute("car", car);
        return "carManagement";
    }

    @PostMapping("/new")
    public String createCar(@ModelAttribute Car car) {
        car.setId(null);
        carService.createCar(car);
        return "redirect:/cars";
    }

    @PostMapping("/<edit/>{id}")
    public String updateCar(@PathVariable Long id, @ModelAttribute Car updatedCar, Model model) {
        carService.updateCar(id, updatedCar);
        return "redirect:/cars";
    }

    @PostMapping("/delete/{id}")
    public String deleteCar(@PathVariable("id") Long id) {
        carService.deleteCar(id);
        return "redirect:/cars";
    }
    @GetMapping("/edit/{id}")
    public String editCar(@PathVariable Long id, Model model) {
        Car car = carService.getCarById(id);
        model.addAttribute("car", car);
        return "editeCar";
    }

    


}
