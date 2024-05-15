package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class
DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/welcome")
	public String sayHi() {
		return "Hello World!";
	}

	@PostMapping("/greet")
	public String greetWithName(@RequestBody String name) {
		return "Hello, " + name + "! This is a POST request.";
	}

	@PatchMapping("/update/{id}")
	public String partialUpdate(@PathVariable("id") Long id, @RequestBody String newData) {
		return "Resource with ID " + id + " updated with data: " + newData;
	}

	@PutMapping("/update/{id}")
	public String updateResource(@PathVariable("id") Long id, @RequestBody String newData) {
		return "Resource with ID " + id + " updated with data: " + newData;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteResource(@PathVariable("id") Long id) {
		return "Resource with ID " + id + " deleted.";
	}
}
