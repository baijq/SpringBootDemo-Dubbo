package com.springboot.demo.mapper;

import com.springboot.demo.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 学生的mapper接口
 * 
 * @author 017220
 * @date 2018.5.23
 */
@Mapper
public interface StudentMapper {
	
	int insert(Student student);
	
	Student find(Integer id);
	
	List<Student> findAll();
	
	List<Student> findAll(Student student);
	
	void update(Student student);
}
