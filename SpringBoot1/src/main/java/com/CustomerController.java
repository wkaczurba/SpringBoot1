package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CustomerController {
	
	@RequestMapping("")
	public String home() {
		return "home";
	}
}
