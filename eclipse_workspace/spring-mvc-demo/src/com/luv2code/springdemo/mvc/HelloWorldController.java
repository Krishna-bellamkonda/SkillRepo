package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//controller method to show the initial html form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//controller method to process html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//controller method to read student name and return upper-case version
	@RequestMapping("/processFormV2")
	public String processFormV2(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		
		String result = "Yo! " + theName;
		
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormV3")
	public String processFormV3(@RequestParam("studentName") String theName, Model model) {
		
		//Below line is no longer needed, 'cause we are using @RequestParam annotation
		//String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		String result = "How are you doing! " + theName;
		
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
}
