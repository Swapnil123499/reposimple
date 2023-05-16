package com.report.repository.imp.model;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.report.model.entity.Classroom;
import com.report.model.entity.Students;
import com.report.model.entity.Subjects;
import com.report.repository.model.SubjectsRepository;
import com.report.service.SubjectService;
@Service
public class Subjectsimpl implements SubjectService {
	@Autowired
	private SubjectsRepository repository;
	

	@Override
	public Subjects CreateSubject(Subjects subjects) {
		
		return this.repository.save(subjects);
	}

	@Override
	public Subjects UpdateSubject(Subjects subjects) {
		
		return this.repository.save(subjects);
	}

	@Override
	public Set<Subjects> GetAllSubjects() {
		
		return new LinkedHashSet<Subjects>(this.repository.findAll());
	}

	@Override
	public Set<Subjects> GetSubjectsinClass(Classroom classroom) {
		
		return this.repository.findByClassroom(classroom);
	}

	@Override
	public void deletesubject(Long subid) {
		this.repository.deleteById(subid);

	}

}
