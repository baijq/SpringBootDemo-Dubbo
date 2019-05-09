package com.springboot.demo.web;

import com.springboot.demo.web.request.UserLoginRequest;
import com.springboot.demo.web.response.UserLoginResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/user")
@Api(tags="LoginController", description="登录操作")
public class LoginController {
	
	@RequestMapping(value = "/login", method = {RequestMethod.POST})
	@ResponseBody
	@ApiOperation(value = "登录")
	public UserLoginResponse login(@RequestBody UserLoginRequest request) {
		System.out.println("老子到此一游");
		System.out.println(request.getName());
		UserLoginResponse response = new UserLoginResponse();
		response.setMsg("success");
		return response;
	}
	
}
