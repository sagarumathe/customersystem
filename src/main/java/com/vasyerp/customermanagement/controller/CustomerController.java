package com.vasyerp.customermanagement.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vasyerp.customermanagement.dto.CustomerDTO;
import com.vasyerp.customermanagement.model.Customer;
import com.vasyerp.customermanagement.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	 @GetMapping("/cust")
     public String reg(Map<String, Object> model) {
		 model.put("customer", new CustomerDTO());
           return "customer";
     }
	 @PostMapping("/home")
     public String createCustomer(@ModelAttribute("customer") CustomerDTO customerDto) {
		 System.out.println("*****************************************");
		 customerService.createCustomer(customerDto);
          
           return "redirect:/list"; 
     }

     @GetMapping("/list")
     public String listOfCustomer(Model model) {
           List<CustomerDTO> customerList = customerService.getAllCustomer();
           model.addAttribute("customerList", customerList);
           return "viewCustomer";
     }
     @PostMapping("/delete")
     public String deleteCustomer(@RequestParam("id") String id) {
    	 	customerService.deleteCustomer(Integer.parseInt(id));
           return "redirect:/list";  
     }
     @GetMapping("/edit")
     public String editCustomer(@RequestParam("id") String id, Map<String, Object> model) {
    	 	CustomerDTO custDTO = customerService.editCustomer(Integer.parseInt(id));
           model.put("customer", custDTO);
           return "customer";
     }
}
