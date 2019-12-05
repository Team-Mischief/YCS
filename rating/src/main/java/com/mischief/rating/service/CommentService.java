package com.mischief.rating.service;

import java.util.List;

import com.mischief.rating.model.Comment;

public interface CommentService {

	Comment findCommentById(int id);

	void createComment(Comment comment);

	List<Comment> findByCodeId(int id);

}