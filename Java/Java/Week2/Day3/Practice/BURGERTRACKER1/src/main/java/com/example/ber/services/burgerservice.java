package com.example.ber.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ber.models.burgermodel;
import com.example.ber.repositories.burgerrepositoy;




@Service
public class burgerservice {
	// Business LOGIC
	// C R U D
	
	// DI
	@Autowired
	private burgerrepositoy burgerRepo;
	
	// READ ALL
	public List<burgermodel> allBurgers(){
		return burgerRepo.findAll();
	}
	
	// CREATE
	public burgermodel createBurger(burgermodel b) {
		return burgerRepo.save(b);
	}
	
	
	// READ ONE
	public burgermodel findBurgerById(Long id) {
		Optional<burgermodel> maybeBurger = burgerRepo.findById(id);
		if(maybeBurger.isPresent()) {
			return maybeBurger.get();
		}else {
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

