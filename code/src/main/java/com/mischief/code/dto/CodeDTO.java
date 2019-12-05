package com.mischief.code.dto;

import java.util.List;

import com.mischief.code.beans.Code;
import com.mischief.rating.model.Comment;

public class CodeDTO extends Code {
	private Double avgRating;
	private List<Comment> commentList;
	public CodeDTO() {
		super();
	}
	public CodeDTO(Code c) {
		super(c.getId(), c.getSnippet(), c.getDev());
	}
	public Double getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(Double avgRating) {
		this.avgRating = avgRating;
	}
	public List<Comment> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((avgRating == null) ? 0 : avgRating.hashCode());
		result = prime * result + ((commentList == null) ? 0 : commentList.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodeDTO other = (CodeDTO) obj;
		if (avgRating == null) {
			if (other.avgRating != null)
				return false;
		} else if (!avgRating.equals(other.avgRating))
			return false;
		if (commentList == null) {
			if (other.commentList != null)
				return false;
		} else if (!commentList.equals(other.commentList))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CodeDTO [avgRating=" + avgRating + ", commentList=" + commentList + "]";
	}
}
