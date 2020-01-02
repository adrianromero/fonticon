/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adr.fonticon;

import javafx.scene.text.Font;

/**
 *
 * @author adrian
 */
public class FontName {

    public static String SOLID;
    public static String REGULAR;
    public static String BRANDS;
    public static String WEATHER;

    static {
        try {
            SOLID = Font.loadFont(IconFont.class.getResourceAsStream("fonts/fa-solid-900.ttf"), 10.0).getName();
            REGULAR = Font.loadFont(IconFont.class.getResourceAsStream("fonts/fa-regular-400.ttf"), 10.0).getName();
            BRANDS = Font.loadFont(IconFont.class.getResourceAsStream("fonts/fa-brands-400.ttf"), 10.0).getName();
            WEATHER = Font.loadFont(IconFont.class.getResourceAsStream("fonts/weathericons-regular-webfont.ttf"), 10.0).getName();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
