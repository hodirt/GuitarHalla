
package com.service;

import com.entity.Guitar;
import java.util.List;


public interface GuitarService {
    Guitar addGuitar(String name, int idOfGuitarType, int idOfColor, int idOfTreeF, int idOfTreeMP, 
            int numberOfString, int numberOfFrets, String pickups, int price);
    Guitar addGuitar(Guitar guitar);
    Guitar setImage(byte[] b, Guitar g);
    void delete(int id);
    Guitar getByName(String name);
    Guitar[] getByType(String type);
    Guitar getById(int id);
    List<Guitar> getAll();
}
