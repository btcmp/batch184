package com.xsis.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/main")
public class Main {
	
	@RequestMapping
	@ResponseBody
	public String index() {
		return "java spring";
	}
	

}
