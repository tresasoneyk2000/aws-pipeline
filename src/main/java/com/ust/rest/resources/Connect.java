package com.ust.rest.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class Connect {
	
	@GetMapping
	public String ready() {
		return "1.2.3.... ready";
	}

}
