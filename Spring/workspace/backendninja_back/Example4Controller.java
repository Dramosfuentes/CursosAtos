package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.model.Person;

@Controller
@RequestMapping("/example4")
public class Example4Controller {
	
	private static final String EXAMPLE4_VIEW = "example4";
	
	@GetMapping("/example4MAV")
	public ModelAndView example4MAV() {
		ModelAndView mav = new ModelAndView(EXAMPLE4_VIEW);
		mav.addObject("person", new Person("Raul", 22));
		return mav;
	}

}
