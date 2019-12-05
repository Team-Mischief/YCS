package com.mischief.rating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mischief.rating.model.Rating;
import com.mischief.rating.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating findRatingById(int id) {
		return ratingRepository.findOne(id);
	}

	@Override
	public void createRating(Rating rating) {
		ratingRepository.save(rating);
	}


	@Override
	public double getAverageRatingByCodeId(int id) {
		List<Rating> ratings = ratingRepository.findAll();
		int sum = 0;
		int count = 0;
		for (Rating r : ratings) {
			if (r.getSnippet_id() == id) {
				sum += r.getBeers();
				count++;
			}
		}
		double average = (double) sum / (double)count;
		return average;
	}

	@Override
	public void deleteRatingById(int id) {
		ratingRepository.delete(id);
	}
}
