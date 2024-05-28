package com.example.ber.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.ber.models.burgermodel;



public interface burgerrepositoy extends CrudRepository<burgermodel, Long> {

	// Find ALL BOOKS
	List<burgermodel> findAll();
}