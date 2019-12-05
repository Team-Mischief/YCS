package com.mischief.rating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.mischief.rating.model.Rating;
import com.mischief.rating.repository.RatingRepository;


@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;
	

	/* (non-Javadoc)
	 * @see com.mischief.rating.service.RatingService#findRatingById(int)
	 */
	@Override
	public Rating findRatingById(int id) {
		return ratingRepository.getOne(id);
	}
	
	/* (non-Javadoc)
	 * @see com.mischief.rating.service.RatingService#createRating(com.mischief.rating.model.Rating)
	 */
	@Override
	public void createRating(Rating rating) {
		ratingRepository.save(rating);
	}
	
	/* (non-Javadoc)
	 * @see com.mischief.rating.service.RatingService#getAverageRatingById(int)
	 */
	@Override
	public double getAverageRatingById(int id) {
		List<Rating> ratings = ratingRepository.findAll();
		int sum = 0;
		for (Rating r: ratings) {
			sum += r.getBeers();
		}
		double average = (double)sum/(double)ratings.size();
		return average;
	}
	
	/* (non-Javadoc)
	 * @see com.mischief.rating.service.RatingService#deleteRatingById(int)
	 */
	@Override
	public void deleteRatingById(int id) {
		ratingRepository.delete(id);
	}
}
