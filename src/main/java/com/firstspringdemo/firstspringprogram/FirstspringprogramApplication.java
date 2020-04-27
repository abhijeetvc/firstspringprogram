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

	@GetMapping(value="/result3")
	public Integer getResult1(@RequestParam(required = false) Integer val1,
							  @RequestParam Integer val2){
		System.out.println("val1----->"+val1);
		System.out.println("val2----->"+val2);
		return 0;
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
