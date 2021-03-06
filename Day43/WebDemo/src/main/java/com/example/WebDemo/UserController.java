package com.example.WebDemo;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@PostMapping("/register")
	public String RegisterUser(ModelAttribute User )
	{
		return "index";
	}
	
	@GetMapping("/mainpage")
	public String mainpage(@RequestParam String Uname ,Model model  ) { //  When we use Model  its Stateless Appplication and Its  Store Value only Inside main Page 
		 
		model.addAttribute("Uname", Uname);
		 //session.setAttribute("fname", Uname);
		
		return "main";
	}
	
	@GetMapping("/moviepage")
	public String moviepage(@RequestParam String Uname , Model model) // Model means Store Value  for Temp 
	{
		
	   // String name = (String)session.getAttribute("fname");
	    model.addAttribute("Uname", Uname);
	 
	 
	
	 
		return "movie";
	}
	
	@GetMapping("/sportpage")
	public String sportpage()
	{
		return "sport";
	}
	

}
