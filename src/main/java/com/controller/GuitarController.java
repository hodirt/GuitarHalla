
package com.controller;

import com.entity.Guitar;
import com.service.GuitarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author home
 */
@Controller
public class GuitarController {
    
    @Autowired
    private GuitarService guitarService;
    
    private Guitar guitar;
    
    @RequestMapping("/electricGuitars")
    public String showElectricGuitars(Model model){
        model.addAttribute("elGuitars", guitarService.getByType("electro"));
        return "electricGuitars";
    }
    
    @RequestMapping("/electricGuitars/{id}")
    public String showGuitar(@PathVariable int id){
        guitar = guitarService.getById(id);
        return "redirect:/particularGuitar";
    }
    
    @RequestMapping("/particularGuitar")
    public String show(Model model){
        model.addAttribute("guitar", guitar);
        return "particularGuitar";
    }
}
