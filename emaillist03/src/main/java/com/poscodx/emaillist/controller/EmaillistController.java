package com.poscodx.emaillist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmaillistController {
	
	@ResponseBody
	@RequestMapping("/")
	public String main() {
		return "ok!";
	}
}
