package com.mischief.rating.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rating implements Serializable{
	@Id
	@GeneratedValue
	private int id;
	private int snippet_id;
	private int dev_id;
	//1-5
	private int beers;
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rating(int id, int snippet_id, int dev_id, int beers) {
		super();
		this.id = id;
		this.snippet_id = snippet_id;
		this.dev_id = dev_id;
		this.beers = beers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSnippet_id() {
		return snippet_id;
	}
	public void setSnippet_id(int snippet_id) {
		this.snippet_id = snippet_id;
	}
	public int getDev_id() {
		return dev_id;
	}
	public void setDev_id(int dev_id) {
		this.dev_id = dev_id;
	}
	public int getBeers() {
		return beers;
	}
	public void setBeers(int beers) {
		this.beers = beers;
	}
	@Override
	public String toString() {
		return "Rating [id=" + id + ", snippet_id=" + snippet_id + ", dev_id=" + dev_id + ", beers=" + beers + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + beers;
		result = prime * result + dev_id;
		result = prime * result + id;
		result = prime * result + snippet_id;
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
		if (dev_id != other.dev_id)
			return false;
		if (id != other.id)
			return false;
		if (snippet_id != other.snippet_id)
			return false;
		return true;
	}
	
	
}
