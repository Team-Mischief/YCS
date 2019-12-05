package com.mischief.rating.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Comment implements Serializable{
	@Id
	@GeneratedValue
	private Integer id;
	
	@NotNull
	private Integer snippetId;
	
	@NotNull
	private Integer developerId;
	
	private String comment;
	
	public Comment() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSnippetId() {
		return snippetId;
	}
	public void setSnippetId(Integer snippetId) {
		this.snippetId = snippetId;
	}
	public Integer getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(Integer devId) {
		this.developerId = devId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((developerId == null) ? 0 : developerId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((snippetId == null) ? 0 : snippetId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (developerId == null) {
			if (other.developerId != null)
				return false;
		} else if (!developerId.equals(other.developerId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (snippetId == null) {
			if (other.snippetId != null)
				return false;
		} else if (!snippetId.equals(other.snippetId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", snippetId=" + snippetId + ", developerId=" + developerId + ", comment=" + comment + "]";
	}
}
