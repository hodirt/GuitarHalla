
package com.service.impl.editor;

import com.service.FirmService;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author home
 */
public class FirmEditor extends PropertyEditorSupport{
    
    private final FirmService firmSystemService;

    public FirmEditor(FirmService firmSystemService) {
        this.firmSystemService = firmSystemService;
    }
    
    @Override
    public void setAsText(String text){       
        setValue(firmSystemService.getById(Integer.valueOf(text)));
    } 
    
}
