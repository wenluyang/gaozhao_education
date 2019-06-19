package com.gaozhao.app_common.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 返回结果类
 * @author Administrator
 *
 */

@ApiModel
public class Result {
	private String code;
	private String msg;
	private Object data;
	
	public Result(String code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	@ApiModelProperty(value = "响应吗",example ="成功时候返回success 失败返回error",dataType = "String" )
	public String getCode() {
		return code;
	}
	@ApiModelProperty(value="返回的消息",example = "错误时返回错误消息,成功返回空字符串",dataType = "String")
	public String getMsg() {
		return msg;
	}
	@ApiModelProperty(value = "返回的json字符串,如果响应码是ERROR时返回的是空字符串", dataType = "String")
	public Object getData() {
		return data;
	}


	public void setCode(String code) {
		this.code = code;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	
	
	
	

}
