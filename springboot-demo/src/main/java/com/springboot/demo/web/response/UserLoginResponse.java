package com.springboot.demo.web.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class UserLoginResponse implements Serializable {

	private static final long serialVersionUID = 5405513632901296861L;
	
	@ApiModelProperty(value = "msg", dataType = "String")
	private String msg;
}
