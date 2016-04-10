/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.entity.Firm;
import com.repository.FirmRepository;
import com.service.FirmService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author home
 */
@Service
public class FirmServiceImpl implements FirmService{
    
    @Autowired
    private FirmRepository firmRepository;
    
    @Override
    public Firm addFirm(String firm) {
        return firmRepository.saveAndFlush(new Firm(firm));
    }

    @Override
    public Firm getByName(String name) {
        return firmRepository.findByName(name);
    }

    @Override
    public Firm getById(int id) {
        return firmRepository.findById(id);
    }

    @Override
    public List<Firm> getAll() {
        return firmRepository.findAll();
    }
    
}
