package com.ghaith.cars.controlles;

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

import com.ghaith.cars.models.Car;
import com.ghaith.cars.models.User;
import com.ghaith.cars.services.CarService;
import com.ghaith.cars.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class CarController {
    @Autowired
    private CarService carSer;

    @Autowired
    private UserService userServ;

    // Display form to create a new car
    @GetMapping("/cars/new")
    public String displayNewCarForm(@ModelAttribute("car") Car car, Model model, HttpSession session) {
    	// Route guard
    	Long userId = (Long) session.getAttribute("user_id");
        if (userId == null) {
            return "redirect:/login"; 
        }

        User loggedUser = userServ.findUserById(userId);
        model.addAttribute("loggedUser", loggedUser);
        return "new.jsp";
    }

    // Process the creation of a new car
    @PostMapping("/processCar")
    public String createCar(@Valid @ModelAttribute("car") Car car, BindingResult result, HttpSession session) {
        if (result.hasErrors()) {
            return "new.jsp";
        }
     // Route guard
        Long userId = (Long) session.getAttribute("user_id");
        if (userId == null) {
            return "redirect:/"; // Route guard
        }

        User user = userServ.findUserById(userId);
        car.setPoster(user);
        Car newCar = carSer.createCar(car);
        return "redirect:/cars/show/" + newCar.getId();
    }

    // Display a single car by its ID
    @GetMapping("/cars/show/{id}")
    public String showCar(@PathVariable("id") Long id, Model model , HttpSession session) {
    	Long userId = (Long) session.getAttribute("user_id");
        if (userId == null) {
            return "redirect:/";
        }// Route guard
    	Car car = carSer.findCarById(id);
        
        model.addAttribute("car", car);
        return "show.jsp";
        
    }
    @GetMapping("/cars")
    public String allCars(Model model,HttpSession session) {
    	Long userId = (Long) session.getAttribute("user_id");
        if (userId == null) {
            return "redirect:/";}
        User user = userServ.findUserById(userId);
        model.addAttribute("user", user);
        List<Car> allCars= carSer.allCars();
        model.addAttribute("allCars", allCars);
        return "home.jsp";
    }

    @GetMapping("/cars/edit/{id}")
    public String updateCr(@PathVariable("id") Long id, Model model,HttpSession session) {
    	// Route guard
    	Long userId = (Long) session.getAttribute("user_id");
        if (userId == null) {
            return "redirect:/";}
    	Car car = carSer.findCarById(id);
        model.addAttribute("car", car);
        return "edit.jsp";
    }

    @PutMapping("/updateCar/{id}")
    public String editCar(@Valid @ModelAttribute("car")  Car car, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        }else {
            carSer.updateCar(car);
        }
        return "redirect:/cars";
    }
    @DeleteMapping("/cars/delete/{id}")
    public String deleteCar(@PathVariable("id") Long id ,HttpSession session) {
    	Long userId = (Long) session.getAttribute("user_id");
        if (userId == null) {
            return "redirect:/";}
        carSer.deleteCar(id);
        return "redirect:/cars";
    }
}