package com.jpacrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stud_id;
	
	@NotBlank
	private String stud_name;
	
	@NotBlank
	private double stud_marks;

	public Student() {
	}

	public Student(int stud_id, @NotBlank String stud_name, @NotBlank double stud_marks) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.stud_marks = stud_marks;
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public double getStud_marks() {
		return stud_marks;
	}

	public void setStud_marks(double stud_marks) {
		this.stud_marks = stud_marks;
	}
	
	
	
}
