
package com.controller;

import com.entity.Guitar;
import com.service.CustomerService;
import com.service.GuitarService;
import java.io.IOException;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author home
 */
@Controller
public class GuitarController {
    
    @Autowired
    private GuitarService guitarService;
    
    @Autowired
    private CustomerService customerService;
    
    private Guitar guitar;
    
    @RequestMapping("/electricGuitars")
    public String showElectricGuitars(Model model){
        model.addAttribute("elGuitars", guitarService.getByType("electro"));
        return "electricGuitars";
    }
    
    @RequestMapping(value = "/particularGuitar", method = RequestMethod.POST)
    public String addGuitarToCustomer(@RequestParam(value = "guitarId") int guitarId, Principal principal){
        
        customerService.addToBuyList(guitarService.getById(guitarId), Integer.parseInt(principal.getName()));
        return "redirect:/";
    }
    
    @RequestMapping("/bassGuitars")
    public String showBassGuitars(Model model){
        model.addAttribute("bassGuitars", guitarService.getByType("bass"));
        return "bassGuitars";
    }
    
    @RequestMapping("/electricGuitars/{id}")
    public String showGuitar(@PathVariable int id){
        guitar = guitarService.getById(id);
        return "redirect:/particularGuitar";
    }
    
    @RequestMapping("/bassGuitars/{id}")
    public String showBassGuitar(@PathVariable int id){
        guitar = guitarService.getById(id);
        return "redirect:/particulardGuitar";
    }
    
    @RequestMapping("/particularGuitar")
    public String show(Model model) throws IOException{
//        BufferedImage img = ImageIO.read(new File("C:\\Users\\home\\Documents\\NetBeansProjects\\GHTest\\src\\main\\webapp\\WEB-INF\\views\\images\\book1.jpg"));
//        Img image = new Img();
//        image.setS(img.);
//        model.addAttribute("i", image);
        model.addAttribute("guitar", guitar);
        return "particularGuitar";
    }
}

