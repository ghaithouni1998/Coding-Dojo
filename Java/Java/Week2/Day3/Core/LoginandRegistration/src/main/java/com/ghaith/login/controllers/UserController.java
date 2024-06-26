package com.ghaith.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ghaith.login.models.LoginUser;
import com.ghaith.login.models.User;
import com.ghaith.login.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class UserController {


		@Autowired
		private UserService userServ;

		@GetMapping("")
		public String index(Model model) {

			model.addAttribute("newUser", new User());
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}

		@PostMapping("/register")
		public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
				HttpSession session) {
			userServ.register(newUser, result);
			if (result.hasErrors()) {
				
				model.addAttribute("newLogin", new LoginUser());
				return "index.jsp";
			}
			session.setAttribute("user_id", newUser.getId());
			return "redirect:/show";
		}

		@PostMapping("/login")
		public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model,
				HttpSession session) {

			User user = userServ.login(newLogin, result);

			if (result.hasErrors()) {
				model.addAttribute("newUser", new User());
				return "index.jsp";
			}
			session.setAttribute("user_id", user.getId());
			return "redirect:/show";
		}

		@GetMapping("/logout")
		public String logout(HttpSession s) {
			s.invalidate();
			return "redirect:/";
		}

		@GetMapping("/show")
		public String home(@ModelAttribute User user, Model model, HttpSession session) {
			// ROUTE GUARD
			Long userId = (Long) session.getAttribute("user_id");
			if (userId == null) {
				return "redirect:/";
			}
			
			User user2 = userServ.findUserById(userId);
			model.addAttribute(user2);
			return "show.jsp";
		}
}
