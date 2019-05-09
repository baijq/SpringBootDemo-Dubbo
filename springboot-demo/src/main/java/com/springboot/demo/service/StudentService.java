package com.springboot.demo.service;

import com.springboot.demo.domain.Student;

import java.util.List;

/**
 * 
 * @author 017220
 *
 */
public interface StudentService {
	
	public void addStudent(Student student);
	
	public Student findStudentById(int id);
	
	public List<Student> findStudentByName(String name);
	
	public void modifyStudent(Student student);
	
	public List<Student> findAll();
}
