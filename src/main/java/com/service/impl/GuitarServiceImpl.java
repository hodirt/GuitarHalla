
package com.service.impl;

import com.entity.Guitar;
import com.repository.GuitarRepository;
import com.service.GuitarService;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuitarServiceImpl implements GuitarService{
    
    @Autowired
    private GuitarRepository guitarRepository;

    @Override
    public Guitar addGuitar(String name, int idOfGuitarType, int idOfColor, int idOfTreeF, int idOfTreeMP, 
            int numberOfString, int numberOfFrets, String pickups, int price) {
        Guitar g = new Guitar();
        return guitarRepository.saveAndFlush(g);
    }
    
    @Override
    public Guitar addGuitar(Guitar guitar){
        guitar.setImagePath(guitar.getName() + ".jpg");
        return guitarRepository.saveAndFlush(guitar);
    }
    
    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Guitar[] getByType(String type) {
        return guitarRepository.findByType(type);
    }

    @Override
    public List<Guitar> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Guitar getById(int id) {
        return guitarRepository.findById(id);
    }

    @Override
    public Guitar getByName(String name) {
        return guitarRepository.findByName(name);
    }

    @Override
    public void setImage(byte[] b, String name) {
        try {
              File f = new File("C://Users//home//Documents//NetBeansProjects//GHTest//src//main//resources//" + name);
              //BufferedImage img = new BufferedImage(40, 40, BufferedImage.TYPE_4BYTE_ABGR);
              
              BufferedOutputStream bfs = new BufferedOutputStream(new FileOutputStream(f));
              
              bfs.write(b);
              bfs.close();
//            BufferedImage bi = ImageIO.read(new ByteArrayInputStream(b));
//            bi.flush();
           // ImageIO.write(bi, ".jpeg", new File("C://Users//home//Documents//NetBeansProjects//GHTest//src//main//resources//guitarImage"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuitarServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GuitarServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
