
package com.controller;

import com.entity.Color;
import com.service.ColorService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ColorController {
    
    
    @RequestMapping(value = "/color", method = RequestMethod.POST, params = "color")
    public String save(@RequestParam String color){
        colorService.addColor(color);
        return "redirect:/color";
    }
    
    @RequestMapping("/color")
    public String show(Model model){
        model.addAttribute("colors", colorService.getAll());
        return "color";
    }
    
    @RequestMapping("/color/{id}")
    public String delete(@PathVariable String id){
        colorService.delete(id);
        return "redirect:/color";
    }
    
    @RequestMapping(value = "/color", method = RequestMethod.POST, params = "colorId")
    public String select(@RequestParam int colorId){
        
        colorService.addColor(String.valueOf(colorId));
        
        return "redirect:/color";
    }
    
    @Autowired
    public ColorService colorService;
    
}
