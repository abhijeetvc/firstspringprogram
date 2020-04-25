package com.firstspringdemo.firstspringprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class FirstspringprogramApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstspringprogramApplication.class, args);
	}

	//@ResponseBody
	@GetMapping(value="/data")
	public String getData(){
		return "Hello Spring";
	}

	//@ResponseBody
//	@RequestMapping(value="/result1/{val1}/{val2}",
//			method = RequestMethod.GET)
	@GetMapping(value="/result1/{val1}/{val2}")
	public Integer getResult(@PathVariable Integer val1,
							 @PathVariable Integer val2){
		return val1+val2;
	}

	@PostMapping(value="/result2")
	public Student getResult2(@RequestBody Student s){
		return s;
	}
}

class Student{
	String name;
	String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
