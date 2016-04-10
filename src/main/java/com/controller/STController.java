
package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class STController {
    
    @RequestMapping("/securityTest")
    public String indexView(Model model) {
        return "securityTest";
    }
}
