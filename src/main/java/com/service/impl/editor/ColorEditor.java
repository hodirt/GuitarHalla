
package com.service.impl.editor;

import com.service.ColorService;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author home
 */
public class ColorEditor extends PropertyEditorSupport{
    
    private final ColorService cS;

    public ColorEditor(ColorService cS) {
        this.cS = cS;
    }
    
    @Override
    public void setAsText(String text){
        setValue(cS.getById(Integer.parseInt(text)));
    }
}
