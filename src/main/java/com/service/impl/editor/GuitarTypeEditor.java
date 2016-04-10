
package com.service.impl.editor;

import com.service.GuitarTypeService;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author home
 */
public class GuitarTypeEditor extends PropertyEditorSupport{

    private final GuitarTypeService gTS;

    public GuitarTypeEditor(GuitarTypeService gTS) {
        this.gTS = gTS;
    }
    
    @Override
    public void setAsText(String text){
        setValue(gTS.getById(Integer.parseInt(text)));
    }
}
