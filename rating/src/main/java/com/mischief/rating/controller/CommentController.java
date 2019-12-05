package com.mischief.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mischief.rating.model.Comment;
import com.mischief.rating.service.CommentServiceImpl;

@RestController
@RequestMapping("/comment/code")
public class CommentController {
	@Autowired
	private CommentServiceImpl commentService;
	
	@GetMapping("/{id}")
	public List<Comment> getById(@PathVariable("id") int id) {
		// get list
		return commentService.findByCodeId(id);
	}
	
	@PostMapping("/{id}")
	public void saveComment(@PathVariable("id") Integer id, @RequestBody Comment comment) {
		comment.setSnippetId(id);
		commentService.createComment(comment);
	}
}
