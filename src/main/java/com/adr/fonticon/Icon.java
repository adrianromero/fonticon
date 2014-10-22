//    FontIcon is a JavaFX library to use FontIcons
//    Copyright (C) 2014 Adrián Romero Corchado.
//
//    This file is part of FontIcon
//
//     Licensed under the Apache License, Version 2.0 (the "License");
//     you may not use this file except in compliance with the License.
//     You may obtain a copy of the License at
//     
//         http://www.apache.org/licenses/LICENSE-2.0
//     
//     Unless required by applicable law or agreed to in writing, software
//     distributed under the License is distributed on an "AS IS" BASIS,
//     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//     See the License for the specific language governing permissions and
//     limitations under the License.

package com.adr.fonticon;

import com.adr.fonticon.transitions.IconTransition;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Bounds;
import javafx.geometry.Orientation;
import javafx.scene.layout.Region;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author adrian
 */
public class Icon extends Region {

    private final Text txt;
    
    public Icon() {
        this(null, 14.0, null, new String[0]);
    }
    
    public Icon(IconFont icon, double size, String... styles) {
        this(icon, size, null, styles);
    }
    
    public Icon(IconFont icon, double size, IconTransition tr, String... styles) {

        this.size = new SimpleDoubleProperty(this, "Size", size);
        this.icon = new SimpleObjectProperty<IconFont>(this, "Icon", icon);
        
        txt = new Text(); 
        txt.getStyleClass().add("fonticon");
        txt.textProperty().bind(Bindings.createStringBinding(() -> {
            IconFont c = fontIconProperty().get();
            return c == null ? "" : c.getString();
        }, fontIconProperty()));
        txt.fontProperty().bind(Bindings.createObjectBinding(() -> {
            IconFont c = fontIconProperty().get();
            return c == null ? Font.getDefault() : Font.font(icon.getFontName(), sizeProperty().getValue());
        } , sizeProperty(), fontIconProperty()));
        getChildren().add(txt);    
        getStyleClass().addAll(styles);
        
        widthProperty().addListener(observer -> resize());
        heightProperty().addListener(observer -> resize());       
        resize();
        
        if (tr != null) {
            tr.applyTransition(txt);
        }        
    }
    
    private DoubleProperty size;    
    public final DoubleProperty sizeProperty() { return size; }
    public final void setSize(double value) { sizeProperty().setValue(value); }
    public final double getSize() { return size.getValue(); }        
    
    private ObjectProperty<IconFont> icon;
    public final ObjectProperty<IconFont> fontIconProperty() { return icon; }
    public final void setFontIcon(IconFont value) { fontIconProperty().setValue(value); }
    public final IconFont getFontIcon() { return icon.getValue(); } 
    
    @Override 
    public final Orientation getContentBias() {
        return txt.getContentBias();
    }    
    
    @Override 
    protected final double computeMaxWidth(double height) {
        return txt.maxWidth(height);
    }

    @Override 
    protected final double computeMaxHeight(double width) {
        return txt.maxHeight(width);
    }
    
    @Override 
    protected final double computeMinWidth(double height) {
        return txt.minWidth(height);
    }

    @Override 
    protected final double computeMinHeight(double width) {
        return txt.minHeight(width);
    }
    
    @Override 
    protected final double computePrefWidth(double height) {
        return txt.prefWidth(height);
    }

    @Override
    protected final double computePrefHeight(double width) {
        return txt.prefHeight(width);
    }
    
    private void resize() {
        Bounds b = txt.getLayoutBounds();
        txt.relocate((getWidth() - b.getWidth()) * 0.5, (getHeight() - b.getHeight()) * 0.5);         
    }    
}
