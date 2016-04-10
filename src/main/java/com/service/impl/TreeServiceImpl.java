
package com.service.impl;

import com.entity.Tree;
import com.repository.TreeRepository;
import com.service.TreeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreeServiceImpl implements TreeService{
    
    @Autowired
    private TreeRepository treeRepository;
    
    @Override
    public Tree addTree(String tree) {
        Tree t = new Tree();
        t.setTreeType(tree);
        Tree savedTree  = treeRepository.saveAndFlush(t);
        
        return savedTree;
    }

    @Override
    public void delete(String id) {
        try{
            int idd = Integer.valueOf(id); 
            treeRepository.delete(idd);
        } catch(Exception e){
            
        }
    }

//    @Override
//    public Tree getByName(String name) {
//        return treeRepository.findByName(name);
//    }

    @Override
    public Tree editTree(String name) {
        Tree t = new Tree();
        t.setTreeType(name);
        return treeRepository.saveAndFlush(t);
    }

    @Override
    public List<Tree> getAll() {
        return treeRepository.findAll();
    }

    @Override
    public Tree getById(int id) {
        return treeRepository.findById(id);
    }
    
}