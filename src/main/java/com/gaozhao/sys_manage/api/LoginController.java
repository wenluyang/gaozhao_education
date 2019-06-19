package com.gaozhao.sys_manage.api;

import com.gaozhao.sys_manage.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@Autowired
	private SysUserService service;
	
	@GetMapping("/login")
	public String index() {
		return "11111";
	}

}
