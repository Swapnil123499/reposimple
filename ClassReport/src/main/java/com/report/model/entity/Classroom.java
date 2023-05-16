package com.report.model.entity;


import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "classroom")
public class Classroom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cid;
	private String classname;
	@OneToMany(mappedBy = "classroom",cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Students> students=new LinkedHashSet<>();
	@OneToMany(mappedBy = "classroom",cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Subjects> subject=new LinkedHashSet<>();
	public Classroom() {super();}
	public Classroom(String classname) {
		super();
		this.classname = classname;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public Set<Students> getStudents() {
		return students;
	}
	public void setStudents(Set<Students> students) {
		this.students = students;
	}
	public Set<Subjects> getSubject() {
		return subject;
	}
	public void setSubject(Set<Subjects> subject) {
		this.subject = subject;
	}
	
}
