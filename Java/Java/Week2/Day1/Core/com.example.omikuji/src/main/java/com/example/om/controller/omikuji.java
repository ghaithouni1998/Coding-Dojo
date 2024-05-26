package com.example.om.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionAttributeListener;

@Controller

public class omikuji {
  @GetMapping("/")
  public String index () {
	  return "form.jsp";
  }
  @PostMapping("/omikuji/show")
  public String processForm(@RequestParam("year") int year ,
		                   @RequestParam("city")String city ,
		                   @RequestParam("person")String person , 
		                   @RequestParam("hobby")String hobby ,
		                   @RequestParam("living")String living ,
		                   @RequestParam("nice")String nice,
		                   HttpSession session  ) {
	  session.setAttribute("keyyear", year);
	  session.setAttribute("keycity", city);
	  session.setAttribute("keyperson", person);
	  session.setAttribute("keyhobby", hobby);
	  session.setAttribute("keyliving", living);
	  session.setAttribute("keynice", nice);
	  
	  return "redirect:/result";
  }
	  @GetMapping("/result")
	  public String result () {
		  return "result.jsp";
	  
  }
	  
  }


