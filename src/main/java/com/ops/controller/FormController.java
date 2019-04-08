package com.ops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	public FormController() {
		System.out.println("FormController.FormController()");
	}

	
	@RequestMapping(value = "/*",method=RequestMethod.GET)
	public String getResponse() {

		return "form";
	}

}
