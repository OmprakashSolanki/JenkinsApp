package com.ops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	

	@RequestMapping(value = "/*", method = RequestMethod.GET)
	public String getResponse() {
	System.out.println("Form Controller");
		return "form";
	}

}
