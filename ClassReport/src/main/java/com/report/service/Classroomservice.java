package com.report.service;

import java.util.Set;

import com.report.model.entity.Classroom;

public interface Classroomservice {
	
	Classroom CreatClassroom(Classroom classroom);
	Classroom UpdateClassroom(Classroom classroom);
	Set<Classroom> GetallClassroom();
	void DeleteClassroom(Long cid);
	
	
	

}
