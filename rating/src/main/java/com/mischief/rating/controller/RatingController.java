package com.mischief.rating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mischief.rating.model.Rating;
import com.mischief.rating.service.RatingServiceImpl;

@RestController
@RequestMapping("/rating/code")
public class RatingController {
	
	@Autowired
	RatingServiceImpl ratingService;
	
	@GetMapping("/{id}")
	public Rating getById(@PathVariable("id") int id) {
		return ratingService.findRatingById(id);
	}
	
	@PostMapping("/{id}")
	public void saveRating(@PathVariable("id") Integer id, @RequestBody Rating rating) {
		rating.setSnippetId(id);
		ratingService.createRating(rating);
	}
	
	@GetMapping("/{id}/average")
	public double getRatingForCode(@PathVariable("id") int id) {
		
		return ratingService.getAverageRatingByCodeId(id);
	}
	
}
