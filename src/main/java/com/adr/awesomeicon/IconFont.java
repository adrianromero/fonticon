/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adr.awesomeicon;

/**
 *
 * @author adrian
 */
public interface IconFont {
  
    public char getChar();
    public String getFontName();

    public default String getString() {
        return Character.toString(getChar());
    }    
}
