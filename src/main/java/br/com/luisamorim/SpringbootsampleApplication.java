package br.com.luisamorim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootsampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootsampleApplication.class, args);
	}
}

@RestController
class HomeController{

	@RequestMapping("/")
	public String hello(){
		return "Spring Boot Application.";
	}
}
