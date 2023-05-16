package com.report.controller.model;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.report.model.entity.Subjects;
import com.report.model.entity.Teachers;
import com.report.service.TeacherService;

@RestController
@RequestMapping("/teacher")
@CrossOrigin("*")
public class TeacherController {
	@Autowired
	private TeacherService service;
	@PostMapping("/")
	Teachers Createnewteacher(@RequestBody Teachers teachers)
	{
		return this.service.CreateTeacher(teachers);
	}
	@PutMapping("/{tid}")
	Teachers Updatenewteacher(@RequestBody Teachers teachers,@PathVariable("tid") Long tid)
	{ teachers.setTid(tid);
		return this.service.UpdateTeacher(teachers);
	}
	@GetMapping("/")
	Set<Teachers> Getallteachersininstitude(){
		return this.service.GetallTeachers();
	}
	@GetMapping("/subject/{sid}")
	Set<Teachers> Getallteachersworkinclass(@PathVariable("sid") Long sid,Subjects subjects){
		subjects.setSubid(sid);
		return this.service.GetTeachersinsubjects(subjects);
	}
	@DeleteMapping("{sid}")
	void DeleteById(@PathVariable("sid") Long sid) {
		this.service.deleteteacher(sid);
	}

}
