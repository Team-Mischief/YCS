package com.mischief.rating.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
public class Rating implements Serializable{
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	private int snippetId;
	
	private int developerId;
	
	@Range(min=1, max=5)
	private int beers;
	
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rating(int id, int snippet_id, int dev_id, int beers) {
		super();
		this.id = id;
		this.snippetId = snippet_id;
		this.developerId = dev_id;
		this.beers = beers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSnippetId() {
		return snippetId;
	}
	public void setSnippetId(int snippet_id) {
		this.snippetId = snippet_id;
	}
	public int getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(int dev_id) {
		this.developerId = dev_id;
	}
	public int getBeers() {
		return beers;
	}
	public void setBeers(int beers) {
		this.beers = beers;
	}
	@Override
	public String toString() {
		return "Rating [id=" + id + ", snippetId=" + snippetId + ", developerId=" + developerId + ", beers=" + beers
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + beers;
		result = prime * result + developerId;
		result = prime * result + id;
		result = prime * result + snippetId;
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
		Rating other = (Rating) obj;
		if (beers != other.beers)
			return false;
		if (developerId != other.developerId)
			return false;
		if (id != other.id)
			return false;
		if (snippetId != other.snippetId)
			return false;
		return true;
	}
	
	
}
