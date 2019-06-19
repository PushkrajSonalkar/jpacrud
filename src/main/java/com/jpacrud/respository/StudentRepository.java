package com.jpacrud.respository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.jpacrud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Serializable>{

	

}
