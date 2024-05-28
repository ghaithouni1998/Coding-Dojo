package com.example.ber.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ber.models.burgermodel;
import com.example.ber.services.burgerservice;

import jakarta.validation.Valid;

;

@Controller
@RequestMapping("/burger")
public class burgercontroller {

	// DI
	@Autowired
	private burgerservice burgerServ;

	// display all
	@GetMapping("")
	public String home(@ModelAttribute("burger") burgermodel burger, Model model) {
		// retrieve all burger from 
		List<burgermodel> allBurgers = burgerServ.allBurgers();
		model.addAttribute("allBurgers", allBurgers);
		return "home.jsp";
	}

	// Process
	@PostMapping("/processBurger")
	public String createBurger(@Valid @ModelAttribute("burger") burgermodel burger, BindingResult result, Model model) {
		if (result.hasErrors()) {
			// retrieve all burger from 
			List<burgermodel> allBurger = burgerServ.allBurgers();
			model.addAttribute("allBurgers", allBurger);
			return "home.jsp";
		} else {
			burgermodel newBook = burgerServ.createBurger(burger);
			return "redirect:/burger";
		}

	}
}
