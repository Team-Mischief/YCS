package com.mischief.rating.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mischief.rating.model.Comment;
import com.mischief.rating.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentRepository commentRepository;
	
	/* (non-Javadoc)
	 * @see com.mischief.rating.service.CommentService#findCommentById(int)
	 */
	@Override
	public Comment findCommentById(int id) {
		return commentRepository.findOne(id);
	}
	
	/* (non-Javadoc)
	 * @see com.mischief.rating.service.CommentService#createComment(com.mischief.rating.model.Comment)
	 */
	@Override
	public void createComment(Comment comment) {
		commentRepository.save(comment);
	}
	
	/* (non-Javadoc)
	 * @see com.mischief.rating.service.CommentService#finByCodeId(int)
	 */
	@Override
	public List<Comment> findByCodeId(int id){
		List<Comment> comments = commentRepository.findAll();
		List<Comment> output = new ArrayList<>();
		for (Comment c: comments) {
			if(c.getSnippetId() == id) {
				output.add(c);
			}
		}
		return output;
	}
}
