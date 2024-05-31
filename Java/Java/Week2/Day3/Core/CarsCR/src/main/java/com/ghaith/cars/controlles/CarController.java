package com.ghaith.cars.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ghaith.cars.models.Car;
import com.ghaith.cars.services.CarService;

import jakarta.validation.Valid;

@Controller
public class CarController {
	@Autowired
	private CarService carSer;
//	CREATE
	@GetMapping("/cars/new")
	public String newCar(@ModelAttribute("car") Car car) {
		return "new.jsp";
	}
	@PostMapping("/processCar")
	public String createCar(@Valid @ModelAttribute("car") Car car, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}else {
			Car newCar= carSer.createCar(car);
			return "redirect:/cars/show/"+newCar.getId();
		}
	}
	@GetMapping("/cars/show/{id}")
	public String OneCar(@PathVariable("id")Long id,Model model) {
		Car car = carSer.findCarById(id);
		model.addAttribute("car",car);
		return "show.jsp";
	}
	
	@GetMapping("/cars")
	public String home(Model model) {
		List<Car> allCars = carSer.allCars();
		model.addAttribute("allCars", allCars);
		return "home.jsp";
	}
	
}
