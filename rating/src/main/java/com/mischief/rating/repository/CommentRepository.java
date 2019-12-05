package com.mischief.rating.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mischief.rating.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
