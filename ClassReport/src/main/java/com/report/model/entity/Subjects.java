package com.report.model.entity;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "subjects")
public class Subjects {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long subid;
	private String subname;
	@ManyToOne(fetch = FetchType.EAGER)
	private Classroom classroom;
	@OneToMany(mappedBy = "subjects",cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Teachers> teachers=new LinkedHashSet<>();
	public Subjects() {super();}
	public Subjects(String subname) {super();this.subname=subname;}
	public Long getSubid() {
		return subid;
	}
	public void setSubid(Long subid) {
		this.subid = subid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	
	public Set<Teachers> getTeachers() {
		return teachers;
	}
	public void setTeachers(Set<Teachers> teachers) {
		this.teachers = teachers;
	}
	public Classroom getClassr() {
		return classroom;
	}
	public void setClassr(Classroom classroom) {
		this.classroom = classroom;
	}
	
	

}
