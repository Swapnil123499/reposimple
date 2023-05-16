package com.report.model.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "teachers")
public class Teachers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tid;
	private String tname;
	private String tphone;
	private String address;
	@ManyToOne(fetch = FetchType.EAGER)
	
	private Subjects subjects;
	public Teachers() {super();}
	public Teachers(String tname, String tphone, String address) {
		super();
		this.tname = tname;
		this.tphone = tphone;
		this.address = address;
	}
	public Long getTid() {
		return tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTphone() {
		return tphone;
	}
	public void setTphone(String tphone) {
		this.tphone = tphone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Subjects getSubjects() {
		return subjects;
	}
	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}
	
	

}
