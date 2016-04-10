
package com.controller;

import com.entity.*;
import com.service.*;
import com.service.impl.editor.ColorEditor;
import com.service.impl.editor.FirmEditor;
import com.service.impl.editor.GuitarTypeEditor;
import com.service.impl.editor.TreeEditor;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author home
 */

@Controller
public class AddGuitarController {
    
    @Autowired
    private GuitarService guitarService;
    
    @Autowired
    private FirmService firmService;
    
    @Autowired
    private TreeService treeService;
    
    @Autowired
    private ColorService colorService;
    
    @Autowired
    private GuitarTypeService guitarTypeService;
    
    @RequestMapping(value = "/addGuitar", method = RequestMethod.POST)
    public String addGuitar(@Valid @ModelAttribute("guitar") Guitar guitar, BindingResult br){
        if(br.hasErrors()){
            return "addGuitar";
        }
        guitarService.addGuitar(guitar);
        return "redirect:/addGuitar";
    }
    
    @RequestMapping("/addGuitar")
    public String show(Model model){
        model.addAttribute("firms", firmService.getAll());
        model.addAttribute("tree", treeService.getAll());
        model.addAttribute("colors", colorService.getAll());
        model.addAttribute("guitarTypes", guitarTypeService.getAll());
        return "addGuitar";
    }
    
    @InitBinder
    public void initBinderFirm(WebDataBinder binder){
        binder.registerCustomEditor(Firm.class, new FirmEditor(firmService));
    }
    
    @InitBinder
    public void initBinderColor(WebDataBinder binder){
        binder.registerCustomEditor(Color.class, new ColorEditor(colorService));    
    }

    @InitBinder
    public void initBinderGuitarType(WebDataBinder binder){
        binder.registerCustomEditor(GuitarType.class, new GuitarTypeEditor(guitarTypeService));        
    }
    
    @InitBinder
    public void initBinderTree(WebDataBinder binder){
        binder.registerCustomEditor(Tree.class, new TreeEditor(treeService));        
    }
    
    @ModelAttribute("guitar")
    public Guitar newGuitar(){
        return new Guitar();
    }
}
