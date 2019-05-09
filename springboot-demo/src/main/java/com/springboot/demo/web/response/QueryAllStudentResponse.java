package com.springboot.demo.web.response;

import com.springboot.demo.domain.Student;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class QueryAllStudentResponse implements Serializable {

	private static final long serialVersionUID = -3571371715103376257L;
	
	@ApiModelProperty(value = "学生列表", dataType = "List")
	private List<Student> list;

}
