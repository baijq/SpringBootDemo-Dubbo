package com.springboot.demo.web.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 登录请求
 * 
 * @author 017220
 */
@Data
@ApiModel
public class UserLoginRequest implements Serializable {
	
	private static final long serialVersionUID = -3841898255218703641L;
	
	@ApiModelProperty(value = "name", example = "tom", dataType = "String")
	private String name;
	
	@ApiModelProperty(value = "pwd", example = "***", dataType = "String")
	private String pwd;
 
}
