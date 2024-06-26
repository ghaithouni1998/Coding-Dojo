package com.Daikichi.Routes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}
	@RequestMapping("/daikichi")
	public String daikichi() {
		return "welcome!";
	}
	@RequestMapping("/daikichi/today")
	public String today() {
		return "Today you will find luck in all your endeavors";
	}
	@RequestMapping("/daikichi/tomorrow")
	public String tom() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}

}
