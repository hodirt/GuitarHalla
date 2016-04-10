/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TreeController {
    
    @RequestMapping(value = "/tree", method = RequestMethod.POST)
    public String save(@RequestParam(value="treeType") String tree){
        
        treeService.addTree(tree);
        return "redirect:/tree";
    }
    
    @RequestMapping("/tree")
    public String show(Model model){
        model.addAttribute("trees", treeService.getAll());
        return "tree";
    }
    
    @RequestMapping("/tree/{id}")
    public String delete(@PathVariable String id){
        treeService.delete(id);
        return "redirect:/tree";
    }
    
    @Autowired
    public TreeService treeService;

    
}
