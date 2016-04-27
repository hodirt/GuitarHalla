

package com.service;

import com.entity.Color;
import java.util.List;


public interface ColorService {
    Color addColor(String color);
    void delete(String id);
    Color getByName(String name);
    Color getById(int id);
    Color editColor(String color);
    List<Color> getAll();
    
}
