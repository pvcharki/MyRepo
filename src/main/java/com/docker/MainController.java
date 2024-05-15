package com.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/docker")
	public String getData()
	{
		return "Springboot with docker";
		
	}
}
