/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconexionyimi;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author andrealaris
 */
public class validar {
    Character s;
    
    public void validarLetras(KeyEvent evt){
        s=evt.getKeyChar();
        if(!Character.isLetter(s)){
            evt.consume();
        }
    }
    
    public void validarConEspacios(KeyEvent evt){
        s=evt.getKeyChar();
        if(!Character.isLetter(s) && s!=KeyEvent.VK_SPACE){
            evt.consume();
        }
    }

    void validarConEspacios(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
