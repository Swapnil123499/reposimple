package com.report.repository.model;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.report.model.entity.Classroom;
import com.report.model.entity.Students;

public interface StudentsRepository extends JpaRepository<Students, Long> {
	public Set<Students>  findByclassroom(Classroom classroom);

}
