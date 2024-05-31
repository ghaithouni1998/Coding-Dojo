package com.ghaith.cars.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghaith.cars.models.Car;
import com.ghaith.cars.repositories.CarRepo;

@Service
public class CarService {
	@Autowired
	private CarRepo carRepo;
	
//	Create 
	public Car createCar(Car car) {
		return carRepo.save(car);
	}
//  READ ALL
	public Car findCarById(Long id) {
		Optional<Car> optCar= carRepo.findById(id);
		if(optCar.isPresent()) {
			return optCar.get();
		}
		else {
		return null;
		}
	}
//	READ ALL
	public List<Car> allCars(){
		return carRepo.findAll();
	}
}
