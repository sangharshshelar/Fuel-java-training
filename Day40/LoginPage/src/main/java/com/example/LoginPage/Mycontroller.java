package com.example.LoginPage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Mycontroller {
	@Autowired
	LoginRepository loginrepo ; 
	
	@PostMapping("/createuser")
	public String CraeteUser(@ModelAttribute LoginPage login)
	{
		
		loginrepo.save(login);
		return "index";
		
	}
	
	@GetMapping("/showall")
	public String Show(Model model)
	{  
		List<LoginPage> ob = loginrepo.findAll();
		model.addAttribute("loginpage", ob);
		return "result";
	}

}
