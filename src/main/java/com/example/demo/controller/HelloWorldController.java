package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HelloWorldController {
	
	//controlador para una pagina del form
	@RequestMapping("/showForm")
	public String ShowForm() {
		
		return "helloworld-form";
	}
	
	//controlador para el metodo del submit del form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	} 
	@RequestMapping("/newProcesForm")
	public String studentName(HttpServletRequest request, Model model) {
		
		//read the request for parameter for the HTML form
		String theName = request.getParameter("studentName"); 
		//convert the data to upperCase
		theName = theName.toUpperCase();
		//create message
		String message = "Hi, " + theName;
		//add message to the model
		model.addAttribute("message", message);
		
		return "helloworld";
	}
	@RequestMapping("/newProcesForm2")
    public String studentName2(@RequestParam("studentName") String theName, Model model) {
        
        //convert the data to upperCase
        theName = theName.toUpperCase();
        //create message
        String message = "Hi, 3 " + theName;
        //add message to the model
        model.addAttribute("message", message);
        
        return "helloworld";
    }
	
	
	

}
