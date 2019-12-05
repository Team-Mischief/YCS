package com.mischief.rating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mischief.rating.model.Rating;
import com.mischief.rating.service.RatingServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/rating/code")
public class RatingController {
	
	@Autowired
	RatingServiceImpl ratingService;
	
	@GetMapping("/{id}")
	public Rating getById(@PathVariable("id") int id) {
		System.out.println("====================================");
		return ratingService.findRatingById(id);
	}
	
	@PostMapping("/create_rating")
	public void saveRating(@RequestBody Rating rating) {
		ratingService.createRating(rating);
	}
	
}
