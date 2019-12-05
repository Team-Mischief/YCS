package com.mischief.rating.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mischief.rating.model.Rating;


@RepositoryRestResource(collectionResourceRel="rating", path="rating")
public interface RatingRepository extends JpaRepository<Rating, Integer>{

}
