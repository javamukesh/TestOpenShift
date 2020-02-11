package com.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Microservice1 {
	@GetMapping("/sample")
	public String myMicroservice() {
		return "First-micro service deployed on openshift";
	}
	
	@GetMapping("/sample/{name}")
	public String myMicroservice(@PathVariable("name") String name) {
		return "Hello Mr. "+name;
	}
}
