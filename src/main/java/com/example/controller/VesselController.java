package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VesselController {
	
	
	@PostMapping("/")
    public void addJson(@RequestBody String jsonString) {
        validateJson(jsonString);
    }

	private void validateJson(String jsonString) {
		// TODO Auto-generated method stub
		
	}

}
