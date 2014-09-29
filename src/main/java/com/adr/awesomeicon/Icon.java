//    AwesomeIcon is a JavaFX library to use Fontawesome
//    Copyright (C) 2014 Adrián Romero Corchado.
//
//    This file is part of AwesomeIcon
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

package com.adr.awesomeicon;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;

/**
 *
 * @author adrian
 */
public class Icon extends Region {

    private final Label label;
    
    public Icon(AwesomeIcon iconchar, double iconsize, String... iconstyles) {

        size = new SimpleDoubleProperty(this, "Size", iconsize);
        icon = new SimpleObjectProperty<AwesomeIcon>(this, "Icon", iconchar);
        
        label = new Label(); 
        label.getStyleClass().add("awesome");
        label.textProperty().bind(Bindings.createStringBinding(() -> {
            AwesomeIcon c = iconProperty().get();
            return c == null ? "" : c.getString();
        }, iconProperty()));       
        label.fontProperty().bind(Bindings.createObjectBinding(() -> FontAwesome.getFont(sizeProperty().getValue())
                , sizeProperty()));
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
    
    private ObjectProperty<AwesomeIcon> icon;
    public final ObjectProperty<AwesomeIcon> iconProperty() { return icon; }
    public final void setIcon(AwesomeIcon value) { iconProperty().setValue(value); }
    public final AwesomeIcon getIcon() { return icon.getValue(); } 
    
    @Override 
    public final Orientation getContentBias() {
        return label.getContentBias();
    }    
    
    @Override 
    public final double computeMaxWidth(double height) {
        return label.maxWidth(height);
    }

    @Override 
    public final double computeMaxHeight(double width) {
        return label.maxHeight(width);
    }
    
    @Override 
    public final double computeMinWidth(double height) {
        return label.minWidth(height);
    }

    @Override 
    public final double computeMinHeight(double width) {
        return label.minHeight(width);
    }
    
    @Override 
    public final double computePrefWidth(double height) {
        return label.prefWidth(height);
    }

    @Override
    public final double computePrefHeight(double width) {
        return label.prefHeight(width);
    }
}
