package com.mischief.code.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mischief.code.beans.Developer;
import com.mischief.code.data.DeveloperRepo;

@Service
public class DeveloperService {
	@Autowired
	private DeveloperRepo dr;
	
	public List<Developer> getDevelopers(){
		return dr.findAll();
	}
	public Developer getDeveloper(Integer id) {
		return dr.getOne(id);
	}
	public Developer addDeveloper(Developer dev) {
		return dr.save(dev);
	}
}
