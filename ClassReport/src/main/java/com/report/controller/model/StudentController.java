package com.report.controller.model;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.report.model.entity.Classroom;
import com.report.model.entity.Students;
import com.report.service.StudentServices;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {
	@Autowired
	private StudentServices services;
	@PostMapping("/")
	public Students CreatenewStudents(@RequestBody Students students) {
		return this.services.CreateStudents(students);
	}
	@PutMapping("/{sid}")
	public Students UpdatenewStudents(@RequestBody Students students,@PathVariable("sid") Long sid) {
		students.setSid(sid);
		return this.services.UpdateStudents(students);
	}
	@GetMapping("/")
	Set<Students> AllStudents(){
		return this.services.GetallStudents();
	}
	@GetMapping("/classroom/{cid}")
	Set<Students> AllStudentsofclass(@PathVariable("cid") Long cid)
	{    Classroom classroom =new Classroom();
	       classroom.setCid(cid);
		return this.services.GetStudentsInClass(classroom);
	}
	@DeleteMapping("/{sid}")
	void RemoveStudent(@PathVariable("sid") Long sid) {
		this.services.DeleteStudent(sid);
	}
	

}
