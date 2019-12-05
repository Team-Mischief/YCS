package com.mischief.rating.service;

import com.mischief.rating.model.Rating;

public interface RatingService {

	Rating findRatingById(int id);

	void createRating(Rating rating);

	double getAverageRatingById(int id);

	void deleteRatingById(int id);

}