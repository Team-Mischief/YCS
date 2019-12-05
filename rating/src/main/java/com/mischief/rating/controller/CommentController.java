package com.mischief.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mischief.rating.model.Comment;
import com.mischief.rating.service.CommentServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/comment/code")
public class CommentController {
	@Autowired
	private CommentServiceImpl commentService;
	
	@GetMapping("/{id}")
	public Comment getById(@PathVariable("id") int id) {
		return commentService.findCommentById(id);
	}
	
	@PostMapping("/create_comment")
	public void saveComment(@RequestBody Comment comment) {
		commentService.createComment(comment);
	}
	
	@GetMapping("/{id}/by_code_id")
	public List<Comment> getCommentsByCode(@PathVariable("id") int id){
		return commentService.findByCodeId(id);
	}
}
