package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class CustomerController {
	
	@Autowired
	CustomerRepository repo;
	
	public CustomerController(CustomerRepository repo) {
		this.repo = repo;
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public ModelAndView home(Customer customer) {
		repo.Save(customer);
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject(new Customer());
		modelAndView.addObject(repo.findAll()); // thius will be saved as: customerList.
		return modelAndView;
	}
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("home");
		List<Customer> customers = repo.findAll();
		modelAndView.addObject(customers); // Will be saved as: customerList
		modelAndView.addObject(new Customer());
		
		//System.out.println("modelAndView.all: " + modelAndView.getModelMap());
		return modelAndView;
	}
}
