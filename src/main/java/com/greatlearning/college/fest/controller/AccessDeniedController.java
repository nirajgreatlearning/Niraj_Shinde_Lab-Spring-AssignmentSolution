package com.greatlearning.college.fest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/access")
public class AccessDeniedController {

	@RequestMapping("/denied")
	public ModelAndView accessDenied() {
		ModelAndView accessDenied = new ModelAndView("common/access-denied");
		accessDenied.addObject("errorMsg", " You do not have access!");
		return accessDenied;
	}
}
