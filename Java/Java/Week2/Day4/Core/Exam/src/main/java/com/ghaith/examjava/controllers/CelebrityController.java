package com.ghaith.examjava.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ghaith.examjava.models.Celebrity;
import com.ghaith.examjava.models.User;
import com.ghaith.examjava.serveces.CelebrityService;
import com.ghaith.examjava.serveces.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class CelebrityController {
	@Autowired
	private CelebrityService celebritySer;

	@Autowired
	private UserService userServ;

	// Display form to create a new celebrity
	@GetMapping("/celebrites/new")
	public String displayNewCelebrityForm(@ModelAttribute("celebrity") Celebrity celebrity, Model model,
			HttpSession session) {
		// Route guard
		Long userId = (Long) session.getAttribute("user_id");
		if (userId == null) {
			return "redirect:/";
		}

		User loggedUser = userServ.findUserById(userId);
		model.addAttribute("loggedUser", loggedUser);
		return "new.jsp";
	}

	// Process the creation of a new celebrity
	@PostMapping("/processCelebrites")
	public String createCelebrity(@Valid @ModelAttribute("celebrity") Celebrity celebrity, BindingResult result,
			HttpSession session) {
		if (result.hasErrors()) {
			return "new.jsp";
		}
		// Route guard
		Long userId = (Long) session.getAttribute("user_id");
		if (userId == null) {
			return "redirect:/"; // Route guard
		}

		User user = userServ.findUserById(userId);
		celebrity.setManager(user);
		Celebrity newCelebrity = celebritySer.createCelebrity(celebrity);
		return "redirect:/home";
	}

	// Display a single celebrity by its ID
	@GetMapping("/celebrites/{id}")
	public String showCelebrity(@PathVariable("id") Long id, Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		if (userId == null) {
			return "redirect:/";
		} // Route guard
		
		User user = userServ.findUserById(userId);
		Celebrity celebrity = celebritySer.findCelebrityById(id);
		model.addAttribute("user", user);
		model.addAttribute("assignedCelebritys", celebritySer.getAssignedCelebritys(id));
		model.addAttribute("celebrity", celebrity);
		return "showone.jsp";

	}
	
	@GetMapping("/home")
	public String allCelebritys(Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		if (userId == null) {
			return "redirect:/";
		}
		User user = userServ.findUserById(userId);
		model.addAttribute("user", user);
		List<Celebrity> allCelebritys = celebritySer.allCelebritys();
		model.addAttribute("allCelebritys", allCelebritys);
		return "home.jsp";
	}

	@GetMapping("/celebrites/{id}/edit")
	public String updateCr(@PathVariable("id") Long id, Model model, HttpSession session) {
		// Route guard
		Long userId = (Long) session.getAttribute("user_id");
		if (userId == null) {
			return "redirect:/";
		}
		Celebrity celebrity = celebritySer.findCelebrityById(id);
		model.addAttribute("celebrity", celebrity);
		return "edit.jsp";
	}

	@PutMapping("/updateCelebrites/{id}")
	public String editCelebrity(@Valid @ModelAttribute("celebrity") Celebrity celebrity, BindingResult result,
			HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");

		if (result.hasErrors()) {
			return "edit.jsp";
		} else {

			User user = userServ.findUserById(userId);
			celebrity.setManager(user);
			celebritySer.updateCelebrity(celebrity);
		}
		return "redirect:/home";
	}

	@DeleteMapping("/celebrites/delete/{id}")
	public String deleteCelebrity(@PathVariable("id") Long id, HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		if (userId == null) {
			return "redirect:/";
		}
		celebritySer.deleteCelebrity(id);
		return "redirect:/home";
	}
}
