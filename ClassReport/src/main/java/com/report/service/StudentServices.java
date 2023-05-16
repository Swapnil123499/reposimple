	package com.report.service;

import java.util.Set;

import com.report.model.entity.Classroom;
import com.report.model.entity.Students;

public interface StudentServices {
	public Students CreateStudents(Students students);
	public Students UpdateStudents(Students students);
	public Set<Students> GetallStudents();
	public Set<Students> GetStudentsInClass(Classroom classroom);
	public void DeleteStudent(Long sid);

}
