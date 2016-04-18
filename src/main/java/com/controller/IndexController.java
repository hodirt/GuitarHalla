package com.controller;


import com.service.ColorService;
import com.service.CustomerService;
import com.service.GuitarService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class IndexController {
     
    @Autowired
    private CustomerService customerService;
    
    @Autowired
    private GuitarService guitarService;
    
    @Autowired
    private ColorService colorService;

    @RequestMapping("/")
    public String indexView() {
        return "index";
    }
    
    

	

}
