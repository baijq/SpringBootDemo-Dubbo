package com.springboot.demo.domain;

import lombok.Data;

/**
 * 学生实体类
 * 
 * @author 017220
 * @date 2018.5.20
 */
@Data
public class Student {
	private Integer id;
	private String name;
	private String password;
	private String note;
}
