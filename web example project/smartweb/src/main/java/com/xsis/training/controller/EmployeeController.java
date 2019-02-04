package com.xsis.training.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping
	public String formEmployee() {
		return "/WEB-INF/views/employee.jsp";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void save(HttpServletRequest req) {
		System.out.println("hallo, "+ req.getParameter("firstName"));
	}
}
