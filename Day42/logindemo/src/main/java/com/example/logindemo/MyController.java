package com.example.logindemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	
	@Autowired
  StudentRepository studrepo;
	
	// go to the register
	@GetMapping("/createuser")
	public String CraeteUser()
	{
		 
		return "create";
		
	}
	
	// register page 
	
	@PostMapping("/save")
	public String LoignUser(@ModelAttribute Student student)
	{
	
		studrepo.save(student);
		return "index";
		
	}
	
	@PostMapping("/check")
	public String loginStudent(@ModelAttribute Student student)
	{
		 String path="invalid";
		 List<Student> list1 = studrepo.findAll();
		 String email_id = student.getEmail();
		 String pass_word = student.getPass();
		 
		 for(Student ob : list1)
		 {
			 if(ob.getEmail().equals(email_id) && ob.getPass().equals(pass_word))
			 {
				 path="result";
				 break;
			 }
		 }
		 return path;
	}
	
}

