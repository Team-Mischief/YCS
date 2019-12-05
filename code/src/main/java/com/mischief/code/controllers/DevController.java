package com.mischief.code.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mischief.code.beans.Developer;
import com.mischief.code.services.DeveloperService;

@RestController
@RequestMapping(value = "/dev")
@CrossOrigin
public class DevController {
	@Autowired
	private DeveloperService ds;
	
	@GetMapping(value = "/{dev_id}")
	public Developer getDeveloper(@PathVariable("dev_id") Integer id) {
		return ds.getDeveloper(id);
	}

	@GetMapping
	public List<Developer> getDevelopers() {
		return ds.getDevelopers();
	}

	@PostMapping
	public Developer addDeveloper(Developer dev) {
		return ds.addDeveloper(dev);
	}

	@PutMapping(value = "/{dev_id}")
	public Developer updateDeveloper(@PathVariable("dev_id") Integer id, Developer dev) {
		return ds.addDeveloper(dev);
	}
}
