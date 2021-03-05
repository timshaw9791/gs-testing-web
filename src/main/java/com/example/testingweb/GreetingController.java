package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

	private final GreetingService service;

	public GreetingController(GreetingService service) {
		this.service = service;
	}


	@GetMapping("/add")
	public  Integer add(Integer a,Integer b){
		return a+b;
	}


	@RequestMapping("/greeting")
	public @ResponseBody String greeting() {
		return service.greet();
	}

}
