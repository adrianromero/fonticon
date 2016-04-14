/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adr.fonticon;

import static com.adr.fonticon.FontAwesome.AWESOMEFONT;

/**
 *
 * @author adrian
 */
public class FontAwesomeList implements IconFont {
    
    private final String text;
    
    public FontAwesomeList(String text) {
        this.text = text;
    }

    @Override
    public String getString() {
        return text;
    }

    @Override
    public String getFontName() {
        return AWESOMEFONT;
    }
}
