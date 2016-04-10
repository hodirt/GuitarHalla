/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.entity.Color;
import com.repository.ColorRepository;
import com.service.ColorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ColorServiceImpl implements ColorService {
    
    @Autowired
    private ColorRepository colorRepository;
    
    @Override
    public Color addColor(String color) {
        Color c = new Color();
        c.setColor(color);
        Color savedColor  = colorRepository.saveAndFlush(c);
        
        return savedColor;
    }

    @Override
    public void delete(String id) {
        try{
            int idd = Integer.valueOf(id); 
            colorRepository.delete(idd);
        } catch(Exception e){
            
        }
    }

    @Override
    public Color getByName(String name) {
        return colorRepository.findByName(name);
    }

    @Override
    public Color editColor(String color) {
        Color c = new Color();
        c.setColor(color);
        return colorRepository.saveAndFlush(c);
    }

    @Override
    public List<Color> getAll() {
        return colorRepository.findAll();
    }

    @Override
    public Color getById(int id) {
        return colorRepository.findById(id);
    }
    
}
