package com.springboot.demo.service.impl;

import com.springboot.demo.domain.Student;
import com.springboot.demo.mapper.StudentMapper;
import com.springboot.demo.service.StudentInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentInitServiceImpl implements StudentInitService {

	@Autowired
	private StudentMapper studentMapper;
	
	Map<String, Student> map = new HashMap<>();
	
	//@PostConstruct
	private void init() {
		List<Student> findAll = studentMapper.findAll();
		for (Student student : findAll) {
			map.put(student.getName(), student);
		}
	}
	
	public Map<String, Student> getMap() {
		return map;
	}
}
