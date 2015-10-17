/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adr.fonticon.decorator;

import com.adr.fonticon.IconDecorator;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Shape;

/**
 *
 * @author adrian
 */
public class FillPaint implements IconDecorator {
    
    private final Paint paint;
    
    public FillPaint(Paint paint) {
        this.paint = paint;
    }
    @Override
    public void decorate(Shape s) {
        s.setFill(paint);
    }
}
