package com.mischief.rating.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mischief.rating.model.Rating;


public interface RatingRepository extends JpaRepository<Rating, Integer>{

}
