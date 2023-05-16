package com.report.repository.imp.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.report.model.entity.Classroom;
import com.report.repository.model.ClassRepository;
import com.report.service.Classroomservice;
@Service
public class Classroomimpl implements Classroomservice {

	@Autowired
	private ClassRepository classRepository;
	
	@Override
	public Classroom CreatClassroom(Classroom classroom) {
		
		return this.classRepository.save(classroom);
	}

	@Override
	public Classroom UpdateClassroom(Classroom classroom) {
		
		return this.classRepository.save(classroom);
	}

	@Override
	public Set<Classroom> GetallClassroom() {
		
		return new LinkedHashSet<>(this.classRepository.findAll());
	}

	@Override
	public void DeleteClassroom(Long cid) {
		
		this.classRepository.deleteById(cid);
		

	}

}
