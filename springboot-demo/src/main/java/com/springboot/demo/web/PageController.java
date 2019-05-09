package com.springboot.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/login")
	public String home(Model model) {
		return "login";
	}
	@RequestMapping("/index")
	public String index(Model model) {
		return "index";
	}
}
