
package com.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {//ще зробити сторінку користувача і прив'язати йому корзину замовлень
    
    @RequestMapping(value = "/login")
    public String show(Model model){
        return "login";
    }
    
    @RequestMapping(value = "/logout")
    public String logout(){
        SecurityContextHolder.getContext().setAuthentication(null);
        return "redirect:/";
    }
    
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String login(@RequestParam("firstName") String firstName, @RequestParam("password") String password){
//        
//        return "Redirect:/";
//    }
    
    
}
