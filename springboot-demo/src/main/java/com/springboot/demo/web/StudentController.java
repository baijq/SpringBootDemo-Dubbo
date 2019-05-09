package com.springboot.demo.web;

import com.springboot.demo.domain.Student;
import com.springboot.demo.service.StudentService;
import com.springboot.demo.web.request.QueryAllStudentRequest;
import com.springboot.demo.web.response.QueryAllStudentResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 控制器，学生的一切请求进行处理
 * 
 * @author 017220
 * @date 2018.5.23
 */
@RestController
@RequestMapping(value="/student")
@Api(tags="StudentController", description="学生信息的操作")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/queryAllStudent", method = {RequestMethod.POST})
	@ResponseBody
	@ApiOperation(value = "查询学生信息")
	public QueryAllStudentResponse queryAllStudent(@RequestBody QueryAllStudentRequest request) {
		
		List<Student> findAll = studentService.findAll();
		
		QueryAllStudentResponse response = new QueryAllStudentResponse();
		response.setList(findAll);
		
		return response;
	}
	
}
