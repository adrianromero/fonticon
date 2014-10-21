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
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.text.Font;

/**
 *
 * @author adrian
 */
public class Icon extends Region {

    private final Label label;
    
    public static Node createIcon(IconFont iconchar, double iconsize, IconTransition tr, String... iconstyles) {
        Label label = new Label();
        label.getStyleClass().add("fonticon");
        label.getStyleClass().addAll(iconstyles);
        label.setFont(Font.font(iconchar.getFontName(), iconsize));
        label.setText(iconchar.getString());
        if (tr != null) {
            tr.applyTransition(label);
        }
        return label;
    }
    
    public static Node createIcon(IconFont iconchar, double iconsize, String... iconstyles) {
        return createIcon(iconchar, iconsize, null, iconstyles);
    }
    
    public Icon(IconFont iconchar, double iconsize, String... iconstyles) {

        size = new SimpleDoubleProperty(this, "Size", iconsize);
        icon = new SimpleObjectProperty<IconFont>(this, "Icon", iconchar);
        
        label = new Label(); 
        label.getStyleClass().add("fonticon");
        label.textProperty().bind(Bindings.createStringBinding(() -> {
            IconFont c = fontIconProperty().get();
            return c == null ? "" : c.getString();
        }, fontIconProperty()));
        label.fontProperty().bind(Bindings.createObjectBinding(() -> {
            IconFont c = fontIconProperty().get();
            return c == null ? Font.getDefault() : Font.font(iconchar.getFontName(), sizeProperty().getValue());
        } , sizeProperty(), fontIconProperty()));
        getChildren().add(label);    
        getStyleClass().addAll(iconstyles);
        
        label.prefWidthProperty().bind(prefWidthProperty());
        label.prefHeightProperty().bind(prefHeightProperty());
        label.maxWidthProperty().bind(maxWidthProperty());
        label.maxHeightProperty().bind(maxHeightProperty());
        label.minWidthProperty().bind(minWidthProperty());
        label.minHeightProperty().bind(minHeightProperty());
    }

    public Icon() {
        this(null, 14.0);
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
        return label.getContentBias();
    }    
    
    @Override 
    protected final double computeMaxWidth(double height) {
        return label.maxWidth(height);
    }

    @Override 
    protected final double computeMaxHeight(double width) {
        return label.maxHeight(width);
    }
    
    @Override 
    protected final double computeMinWidth(double height) {
        return label.minWidth(height);
    }

    @Override 
    protected final double computeMinHeight(double width) {
        return label.minHeight(width);
    }
    
    @Override 
    protected final double computePrefWidth(double height) {
        return label.prefWidth(height);
    }

    @Override
    protected final double computePrefHeight(double width) {
        return label.prefHeight(width);
    }
}
