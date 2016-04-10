
package com.controller;

import com.entity.Customer;
import com.service.CustomerService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerRegistrationController {
    
    @Autowired
    private CustomerService customerService;
    
    @RequestMapping(value = "/registr", method = RequestMethod.POST)
    public String register(@Valid @ModelAttribute("customer") Customer customer, BindingResult br){
        if(br.hasErrors()){
            return "registr";
        }
        customerService.addCustomer(customer);
        
        return "redirect:/";
    }
    
    //@initBinder
    
    @RequestMapping("/registr")
    public String show(){
        
        return "registr";
    }
    
    @ModelAttribute("customer")
    public Customer newCustomer(){
        return new Customer();
    }
}
