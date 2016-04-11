package com.controller;


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

    @RequestMapping("/")
    public String indexView() {
        return "index";
    }
    
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addLogoFile(@RequestParam(value = "file") MultipartFile file,  Integer id) throws IOException{
        if(!(file.getOriginalFilename().endsWith(".jpeg"))
                || file.getOriginalFilename().endsWith(".png")
                || file.getOriginalFilename().endsWith(".jpg")){
            guitarService.setImage(file.getBytes(), null);
            return "redirect:/?" + "wrongfile = true";
        } else if(file.getBytes().length >= 524288000){
            return "redirect:/?" + "bigfile = true";
        } else {
            //Customer customer = customerService.findById(id);
            guitarService.setImage(file.getBytes(), null);
            return "redirect:/";
        }
    }

	

}
