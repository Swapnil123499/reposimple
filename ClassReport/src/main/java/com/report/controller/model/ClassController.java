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
import com.report.service.Classroomservice;
@RestController
@RequestMapping("/classroom")
@CrossOrigin("*")
public class ClassController {
	@Autowired
	private Classroomservice classroomservice;
	@PostMapping("/")
	public Classroom Makeclass(@RequestBody Classroom classroom)
	{
		return this.classroomservice.CreatClassroom(classroom);
	}
	@PutMapping("/{cid}")
	public Classroom Updatedclassroom(@RequestBody Classroom classroom,@PathVariable("cid") Long cid)
	{
		classroom.setCid(cid);
		return this.classroomservice.UpdateClassroom(classroom);
	}
	@GetMapping("/")
	public Set<Classroom> GetAllClasses(){
		return this.classroomservice.GetallClassroom();
	}
	@DeleteMapping("/{cid}")
	public void Deleteclass(@PathVariable("cid") Long cid) {
		this.classroomservice.DeleteClassroom(cid);
		
		
	}
	
	

}
