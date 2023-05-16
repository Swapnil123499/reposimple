package com.report.repository.model;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.report.model.entity.Classroom;
import com.report.model.entity.Subjects;

public interface SubjectsRepository extends JpaRepository<Subjects, Long> {
	public Set<Subjects>  findByClassroom(Classroom classroom);

}
