package com.report.repository.imp.model;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.report.model.entity.Classroom;
import com.report.model.entity.Subjects;
import com.report.model.entity.Teachers;
import com.report.repository.model.TeachersRepository;
import com.report.service.TeacherService;

@Service
public class Teacherimpl implements TeacherService {
	@Autowired
	private TeachersRepository repository;

	@Override
	public Teachers CreateTeacher(Teachers teachers) {
		
		return this.repository.save(teachers);
	}

	@Override
	public Teachers UpdateTeacher(Teachers teachers) {
		
		return this.repository.save(teachers);
	}

	@Override
	public Set<Teachers> GetallTeachers() {
		
		return new LinkedHashSet<>(this.repository.findAll());
	}

	@Override
	public Set<Teachers> GetTeachersinsubjects(Subjects subjects) {
		
		return this.repository.findBySubjects(subjects);
	}

	@Override
	public void deleteteacher(Long tid) {
		this.repository.deleteById(tid);

	}

}
