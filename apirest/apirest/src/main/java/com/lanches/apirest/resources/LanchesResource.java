package com.lanches.apirest.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class LanchesResource {
	
	@GetMapping("/salve")
	public String salve() {
		return "salve";
	}

}
