package com.marvel.avenagers;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
 
@SpringBootApplication
@RestController
public class MarvelApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvelApplication.class, args);
	}
	@RequestMapping("/home")
	public   String  home() {
		return "home";
	}
	@RequestMapping("/heros")
	public   String  heroes() {
		return "Thor spiderman ironman captain";
	}
}
