package org.com.akbar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	
	@RequestMapping("/salam")
	public String slm() {
		return "wakha";
	}
	
	@RequestMapping("/")
	public String home() {
		return "hom";
	}
	
}
