package com.example.SmartShop;

import java.util.HashMap;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {
	
	@GetMapping("/mainpage")
	public String goToMain()
	{
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("A", 10);
        map1.put("B", 30);
        map1.put("C", 20);
        
        System.out.println(map1);
		return "main";
	}
	
	@GetMapping("/nextpage")
	public String goToNext()
	{
		HashMap<String, Integer> map2 = new HashMap<>();
		map2.put("D", 10);
        map2.put("E", 30);
        map2.put("F", 20);
        
        System.out.println(map2);
		return "next";
	}
	
	@GetMapping("/cartpage")
	public String goToCart()
	{
		return "cart";
	}
	
	

}
