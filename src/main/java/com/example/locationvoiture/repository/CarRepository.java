package com.example.locationvoiture.repository;

import com.example.locationvoiture.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
