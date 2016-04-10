
package com.service.impl;

import com.entity.GuitarType;
import com.repository.GuitarTypeRepository;
import com.service.GuitarTypeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuitarTypeServiceImpl implements GuitarTypeService{
    
    @Autowired
    private GuitarTypeRepository guitarTypeRepository;
    
    @Override
    public GuitarType addGuitarType(String guitarType) {
        return guitarTypeRepository.saveAndFlush(new GuitarType(guitarType));
    }

    @Override
    public GuitarType getById(int id) {
        return guitarTypeRepository.findById(id);
    }

    @Override
    public List<GuitarType> getAll() {
        return guitarTypeRepository.findAll();
    }
    
}
