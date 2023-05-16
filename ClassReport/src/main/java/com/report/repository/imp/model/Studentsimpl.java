package com.report.repository.imp.model;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.report.model.entity.Classroom;
import com.report.model.entity.Students;
import com.report.repository.model.StudentsRepository;
import com.report.service.StudentServices;
@Service
public class Studentsimpl implements StudentServices {
	@Autowired
	private StudentsRepository repository;

	@Override
	public Students CreateStudents(Students students) {
	
		return this.repository.save(students);
	}

	@Override
	public Students UpdateStudents(Students students) {
		
		return this.repository.save(students);
	}

	@Override
	public Set<Students> GetallStudents() {
		
		return new LinkedHashSet<Students>(this.repository.findAll());
	}

	@Override
	public Set<Students> GetStudentsInClass(Classroom classroom) {
		
		return this.repository.findByclassroom(classroom);
	}

	@Override
	public void DeleteStudent(Long sid) {
		this.repository.deleteById(sid);

	}

}
