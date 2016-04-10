
package com.controller;

import com.entity.Customer;
import com.service.CustomerService;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerPageController {
    
    @Autowired
    private CustomerService customerService;
    
    @RequestMapping(value = "/settings")
    public String showSettings(Model model, Principal principal){
        if(principal != null){
            Customer customer = customerService.findById(Integer.parseInt(principal.getName()));
            model.addAttribute("user", customer);
            return "settings";
        } else {
            return "redirect:/";
        }
    }
}
