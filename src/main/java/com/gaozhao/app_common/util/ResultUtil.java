package com.gaozhao.app_common.util;

import com.gaozhao.app_common.pojo.Result;

/**
 * 返回结果工具类
 * @author Administrator
 *
 */
public class ResultUtil {
	
	public static Result success(Object data) {
		return new Result("OK", "SUCCESS", data);
	}
	
	public static Result success(String msg) {
		return new Result("OK", "SUCCESS",msg);
	}
	
	public static Result success() {
		return success(null);
	}
	
	public static Result error(String code,String msg) {
		return new Result(code, msg, null);
	}
	
	public static Result error(String msg) {
		return error("ERROR",msg);
	}
	
	

}
