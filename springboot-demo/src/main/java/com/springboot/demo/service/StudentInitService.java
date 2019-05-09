package com.springboot.demo.service;

import com.springboot.demo.domain.Student;

import java.util.Map;

/**
 * 作用：学生初始化，在项目启动时拿到所有的学生，相当于缓存的概念
 * 
 * @author 017220
 * @date 2018.5.23
 */
public interface StudentInitService {
	/**
	 * 获取学生
	 * @return 学生的map,key : student.name;value : student
	 */
	public Map<String, Student> getMap();
}
