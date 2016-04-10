
package com.service;

import com.entity.Tree;
import java.util.List;


public interface TreeService {
    Tree addTree(String tree);
    void delete(String id);
    Tree getById(int id);
    Tree editTree(String tree);
    List<Tree> getAll();
}
