
package com.entity;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author home
 */
public class MultPart {
    
    private MultipartFile mp;

    public MultPart(MultipartFile mp) {
        this.mp = mp;
    }

    public MultipartFile getMp() {
        return mp;
    }

    public void setMp(MultipartFile mp) {
        this.mp = mp;
    }
    
    
}
