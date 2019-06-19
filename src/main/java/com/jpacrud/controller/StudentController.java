package com.jpacrud.controller;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpacrud.dao.StudentDAO;
import com.jpacrud.entity.Student;

@RestController
@RequestMapping("/school")
public class StudentController 
{
	@Autowired
	StudentDAO std;
	
	/* to save stud */
	@PostMapping("/student")
	public Student createStudent(@Valid @RequestBody Student stud) {
		return std.save(stud);
	}
	
	/* get all employee */
	
	@GetMapping("/student")
	public List<Student> getAllStudent(){
		return std.findAll();
	}
	
	/* get student by id */
	@GetMapping("/student/{stud_id}")
	public ResponseEntity<Student> getSudentById(@PathVariable(value = "stud_id") long stud_id){
		Student stud;
		stud = std.findOne(stud_id);
		if(stud==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(stud);
	}
	
	/* update an student by id */
	@PutMapping("/student/{stud_id}")
	public ResponseEntity<Student> updateStudent(@PathVariable(value="stud_id") long stud_id,@Valid @RequestBody Student studDetails){
		Student stud;
		stud = std.findOne(stud_id);
		if(stud==null) {
			return ResponseEntity.notFound().build();
		}
		stud.setStud_name(studDetails.getStud_name());
		stud.setStud_marks(studDetails.getStud_marks());
		Student updateStudent = std.save(stud);
		return ResponseEntity.ok().body(stud);
	}
	
	/* Delete an Student by Id */
	@DeleteMapping("/student/{stud_id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable(value="stud_id") long stud_id){
		Student stud;
		stud =std.findOne(stud_id);
		if(stud==null) {
			return ResponseEntity.notFound().build();
		}
		std.deleteById(stud_id);
		return ResponseEntity.ok().body(stud);
	}
	
	
}
