package com.ghaith.cars.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ghaith.cars.models.Car;

public interface CarRepo extends CrudRepository<Car, Long> {
	List<Car> findAll();
}
