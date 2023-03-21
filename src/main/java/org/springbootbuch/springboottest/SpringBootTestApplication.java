package org.springbootbuch.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}

	@RestController
	public static class HelloWorldController {
		
		@GetMapping("/hello")
		public String helloWorld(@RequestParam final String name) {
			return "Hello, " + name + "\n";
		}
	}
}
