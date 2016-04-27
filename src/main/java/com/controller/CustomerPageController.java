
package com.controller;

import com.entity.Customer;
import com.service.CustomerService;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerPageController {
    
    @Autowired
    private CustomerService customerService;
    
    @RequestMapping(value = "/settings")
    public String showSettings(Model model, Principal principal){
        if(principal != null){
            Customer customer = customerService.findById(Integer.parseInt(principal.getName()));
            model.addAttribute("user", customer);
            model.addAttribute("guitars", customerService.getBuyList(customer.getId()));
            return "settings";
        } else {
            return "redirect:/";
        }
    }
    
    @RequestMapping(value = "/settings/{id}")
    public String deleteFormBuyList(@RequestParam(value = "id") int id, Principal principal){
        customerService.deleteFromBuyList(Integer.parseInt(principal.getName()), id);
        return "redirect:/settings";
    }
}
