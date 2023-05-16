package com.report.repository.model;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.report.model.entity.Subjects;
import com.report.model.entity.Teachers;

public interface TeachersRepository extends JpaRepository<Teachers,Long> {
	
	public Set<Teachers> findBySubjects(Subjects subjects);

}
