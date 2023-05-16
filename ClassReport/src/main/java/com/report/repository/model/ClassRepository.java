package com.report.repository.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.report.model.entity.Classroom;

public interface ClassRepository extends JpaRepository<Classroom, Long> {

}
