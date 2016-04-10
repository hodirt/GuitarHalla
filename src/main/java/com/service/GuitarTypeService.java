
package com.service;

import com.entity.GuitarType;
import java.util.List;


public interface GuitarTypeService {
    GuitarType addGuitarType(String guitarType);
    GuitarType getById(int id);
    List<GuitarType> getAll();
}
