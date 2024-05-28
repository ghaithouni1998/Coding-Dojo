package com.example.ber.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ber.models.burgermodel;
import com.example.ber.services.burgerservice;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/burger")
public class burgercontroller {

	// Dependency Injection
	@Autowired
	private burgerservice burgerServ;

	// Display all burger
	@GetMapping("")
	public String home(@ModelAttribute("burger") burgermodel burger, Model model) {
		List<burgermodel> allBurgers = burgerServ.allBurgers();
		model.addAttribute("allBurgers", allBurgers);
		return "home.jsp";
	}

	// Process creation of a new burger
	@PostMapping("/processBurger")
	public String createBurger(@Valid @ModelAttribute("burger") burgermodel burger, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<burgermodel> allBurgers = burgerServ.allBurgers();
			model.addAttribute("allBurgers", allBurgers);
			return "home.jsp";
		} else {
			burgerServ.createBurger(burger);
			return "redirect:/burger";
		}
	}

	// Display edit form
	@GetMapping("/edit/{id}")
	public String getMethodName(Model model, @PathVariable("id") Long id) {
		burgermodel selectedBurger = burgerServ.findBurgerById(id);
		model.addAttribute("burger", selectedBurger);
		return "edit.jsp";
	}
	
	// Process update of a burger
	@PutMapping("/{id}")
	public String editBurger(@Valid @ModelAttribute("burger") burgermodel burger, BindingResult result) {
		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			burgerServ.updateBurger(burger);
			return "redirect:/burger";
		}
	}
}
