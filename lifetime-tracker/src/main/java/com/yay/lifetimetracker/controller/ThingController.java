package com.yay.lifetimetracker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/things")
public class ThingController {

	@GetMapping
	public List<String> getThings(){
		List<String> things=new ArrayList<>();
		things.add("zarbee");
		things.add("kitchen towel");
		things.add("laptop");
		return things;
		
	}
}
 