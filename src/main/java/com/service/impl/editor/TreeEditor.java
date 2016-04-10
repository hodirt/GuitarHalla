
package com.service.impl.editor;

import com.service.TreeService;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author home
 */
public class TreeEditor extends PropertyEditorSupport{
    
    private final TreeService tS;

    public TreeEditor(TreeService tS) {
        this.tS = tS;
    }
    
    @Override
    public void setAsText(String text){
        setValue(tS.getById(Integer.parseInt(text)));
    }
}
