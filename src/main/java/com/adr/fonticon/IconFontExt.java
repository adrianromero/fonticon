/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adr.fonticon;

/**
 *
 * @author adrian
 */
public interface IconFontExt extends IconFont {
    
    public char getChar();
    @Override
    public default String getString() {
        return Character.toString(getChar());
    }     
}
