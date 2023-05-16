package com.report.service;

import java.util.Set;


import com.report.model.entity.Subjects;
import com.report.model.entity.Teachers;

public interface TeacherService {
	Teachers CreateTeacher(Teachers teachers);
	Teachers UpdateTeacher(Teachers teachers);
	Set<Teachers> GetallTeachers();
	Set<Teachers> GetTeachersinsubjects(Subjects subjects);
	void deleteteacher(Long tid);
	

}
