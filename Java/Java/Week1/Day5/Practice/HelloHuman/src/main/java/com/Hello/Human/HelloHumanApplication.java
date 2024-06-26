package com.Hello.Human;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	 @RequestMapping("/")
	    public String index(@RequestParam(value="name") String name) {
	        return "hello " + name;
	    }
	 @RequestMapping("/name")
	    public String last(@RequestParam(value="name") String name, @RequestParam(value="last_name") String last_name)
	 
	 {
	        return "hello " + name + last_name ;
	    }
	 @RequestMapping("/test")
	    public String  hello(@RequestParam(value="name") String name, @RequestParam(value="times") int times) 
	 {
			String azerty = "<h1>hello "+name+"</h1>";
	 
	 return azerty.repeat(times) ; 
	 }
			
}

