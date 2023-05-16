package com.report.controller.model;



import java.util.HashSet;
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
import com.report.model.entity.Subjects;
import com.report.service.SubjectService;

@RestController
@RequestMapping("/subject")
@CrossOrigin("*")
public class SubjectController {
	@Autowired
	private SubjectService service;
	@PostMapping("/")
	Subjects CraetenewSubject(@RequestBody Subjects subject) {
		return this.service.CreateSubject(subject);
	}
	@GetMapping("/")
	Set<Subjects> Getallsubjects(){
	     
	     
	     return this.service.GetAllSubjects();
		
	}
	@PutMapping("/{subid}")
	Subjects Updateexisting(@RequestBody Subjects subjects,@PathVariable("subid") Long subid) {
		subjects.setSubid(subid);
		return this.service.UpdateSubject(subjects);
	}
	@GetMapping("/classroom/sub/{cid}")
	Set<Subjects> GetSubjectsinclass(@PathVariable("cid") Long cid,Classroom classroom){
		classroom.setCid(cid);
		return this.service.GetSubjectsinClass(classroom);
	}
	@DeleteMapping("/{subid}")
	void RemovedByid(@PathVariable("subid") Long subid)
	{
		this.service.deletesubject(subid);
	}

}
