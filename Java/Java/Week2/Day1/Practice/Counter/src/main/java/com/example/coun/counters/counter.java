package com.example.coun.counters;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class counter {
	
	int count=0;
	@GetMapping("/counter")
	public String ounter() {
		
		return "index.jsp";
	}
	
	@GetMapping("/")
	public String ountera(HttpSession sess) {
		count+=1;
		sess.setAttribute("count", count);
		
		return "welcome.jsp";
	}
	

}
