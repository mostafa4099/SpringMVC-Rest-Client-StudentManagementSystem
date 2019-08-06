/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mostafa.sna.controller;

import com.mostafa.sna.entity.Student;
import com.mostafa.sna.locator.Template;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	Template template = new Template();
	
    @RequestMapping("/registration")
    public String sendMoney(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "registration";
    }
    
    @PostMapping("/action")
    public String registration(@ModelAttribute("student") Student student, Model model){
  	
    	Student s = new Student();
    	s.setFirstName(student.getFirstName());
    	s.setLastName(student.getLastName());
    	s.setEmail(student.getEmail());
    	
    	String response = template.registration(s);
    	String code="";
    	
	  	JSONObject json = new JSONObject(response);
	  	code=json.getString("Response_Code");
	  	
	  	if(code.equals("0")) {
	  		String message = "Success";
	  		Student st = new Student();
	  		model.addAttribute("message", message);
	  		model.addAttribute("student", st);
	  	}
	  	
	  	System.out.println("code: "+code);
	  	
	  	return "registration";
  }
}
