package com.springboot.springbootweb.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String aboutr(Model model) {
		
		model.addAttribute("name","Prasanna Kumar");
		model.addAttribute("currentDate",new Date());
		
		
		return "hello";
	}
	
	
	@GetMapping("/loop")
	public String iterateHandler(Model model) {
		List<String> ls=new ArrayList<>();
		ls.add("pk");
		ls.add("prasanna");
		ls.add("kumar");
		model.addAttribute("names",ls);
		
		return "iterate";
	}
	

}
