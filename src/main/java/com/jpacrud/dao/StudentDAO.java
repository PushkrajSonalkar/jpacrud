package com.jpacrud.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpacrud.entity.Student;
import com.jpacrud.respository.StudentRepository;

@Service
public class StudentDAO 
{
	@Autowired
	static
	StudentRepository studRep;
	
	/* To Save an Student */
	public Student save(Student stud) {
		return studRep.save(stud);
	}
	
	/* To Search all Student */
	public List<Student> findAll(){
		return (List<Student>) studRep.findAll();
	}

	/* to get student by id */
	public Student findOne(long stud_id) {
		
		return studRep.getOne(stud_id);
	}
	private void deke() 
	{
	}

	public void deleteById(long stud_id) {
		studRep.deleteById(stud_id);
	}
	
}
