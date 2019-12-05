package com.mischief.code.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Code {
	@Id
	@Column(name="code_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="code")
	@SequenceGenerator(name="code", sequenceName="code_seq", allocationSize=1)
	private Integer id;
	private String snippet;
	@ManyToOne
	@JoinColumn(name="developer_id")
	private Developer dev;
	public Code() {
		super();
	}
	public Integer getCodeId() {
		return id;
	}
	public void setCodeId(Integer codeId) {
		this.id = codeId;
	}
	public String getSnippet() {
		return snippet;
	}
	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}
	public Developer getDev() {
		return dev;
	}
	public void setDev(Developer dev) {
		this.dev = dev;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((dev == null) ? 0 : dev.hashCode());
		result = prime * result + ((snippet == null) ? 0 : snippet.hashCode());
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
		Code other = (Code) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (dev == null) {
			if (other.dev != null)
				return false;
		} else if (!dev.equals(other.dev))
			return false;
		if (snippet == null) {
			if (other.snippet != null)
				return false;
		} else if (!snippet.equals(other.snippet))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Code [codeId=" + id + ", snippet=" + snippet + ", dev=" + dev + "]";
	}
}
