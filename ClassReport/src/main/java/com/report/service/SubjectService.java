package com.report.service;

import java.util.Set;

import com.report.model.entity.Classroom;
import com.report.model.entity.Subjects;

public interface SubjectService {
	public Subjects CreateSubject(Subjects subjects);
	public Subjects UpdateSubject(Subjects subjects);
	public Set<Subjects> GetAllSubjects();
	public Set<Subjects> GetSubjectsinClass(Classroom classroom);
	public void deletesubject(Long subid);
	

}
