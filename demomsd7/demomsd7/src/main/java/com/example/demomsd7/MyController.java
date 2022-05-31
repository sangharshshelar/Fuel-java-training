package com.example.demomsd7;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@GetMapping
	("/first")
	public String gotoFirst(@RequestParam String uname,HttpSessionsion session) {
		Item<T>m it1=new Iterable<T>em("A", 100);
		Item<T>em it2=new Item("B", 200);
		Item<T>em it3=new Item("C", 300);
		Item<T>tem it4=new Item("D", 400);
		Item<T>em it5=new Item("E", 500);
		Item<T>em it6=new Item("F", 600);
		List<Items> dbitems=new ArrayList<>();
		dbitems.add(it1);<
		dbitems.add(it2);
		dbitems.add(it3);
		dbitems.add(it4);
		dbitems.add(it5);
		dbitems.add(it6);
		
		session.setAttribute("iteminfo", dbitems);
		session.setAttribute("uname", uname);
		List<Item> items=new ArrayList<>();
		session.setAttribute("cart", items);
		
		
		return "main";
	}
	@GetMapping("/second")
	public String gotoSecond(@RequestParam List<String> items,HttpSession session) {
		
		List<Item> db=(List<Item>) session.getAttribute("iteminfo");
		
		List<Item> cart=(List<Item>) session.getAttribute("cart");
		for(String s:items) {
			
			for(Item item:db) {
				if(item.getName().equals(s)) {
					Item it=new Item(item.getName(),item.getCost());
					cart.add(it);
				}
			}
			
		}
		session.setAttribute("cart", cart);
		
		return "second";
	}
	
	@GetMapping("/checkout")
	public String checkout(HttpSession session, Model model) {
		List<Item> cart=(List<Item>) session.getAttribute("cart");
		int total=0;
		for(Item item:cart) {
			
			System.out.println(item.getName()+"=>"+item.getCost());
			total+=item.getCost();
			model.addAttribute("total", total);
			
			
			
		}
		System.out.println("Toal cost is "+total);
		
		return "checkout";
	}
	
	
	
	
}


