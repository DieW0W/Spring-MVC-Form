package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;



@Controller
@RequestMapping("/student")
public class StudentController {
    
    @Value("#{${countryOptions}}")
    public Map<String, String> countryOptions;
    
    @Value("#{${favoriteLanguage}}")
    public Map<String, String> favoriteLanguage;
    
    @Value("#{${listOfSystems}}")
    public String[] operatingSystems;
    
    @RequestMapping("/showForm")
    public String showForm(Model model) {
        
        //creamos el objeto studentName
        Student theStudent = new Student();
        
        /*
         * agregamos el objeto studentName al modelo
         * posteriormente el jsp lo leera y traera la informacion
         * que cargemos en el objeto
         */
        model.addAttribute("student", theStudent); 
        
        model.addAttribute("theCountryOptions", countryOptions);
        
        model.addAttribute("thefavoriteLanguage", favoriteLanguage);
        
        model.addAttribute("theListOfSystems", operatingSystems);
        
        return "student-form";
    }
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        
        //imrpimimos la data que se rellendara en el modelo que pasamos como parametro
        System.out.println("theStudent: " + theStudent.getFirstName()
         + " " + theStudent.getLastName());
        
        return "student-confirmation";
    }
}
