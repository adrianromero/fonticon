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
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author adrian
 * @param <T>
 */
public class Icon<T extends IconFont> extends Text {
    
    public Icon() {
        this(null, 14.0, null, new String[0]);
    }
    
    public Icon(T icon) {
        this(icon, 14.0, null, new String[0]);
    }
    
    public Icon(T icon, double size, String... styles) {
        this(icon, size, null, styles);
    }
    
    public Icon(T icon, double size, IconTransition tr, String... styles) {

        this.size = new SimpleDoubleProperty(this, "Size", size);
        this.icon = new SimpleObjectProperty<T>(this, "Icon", icon);
        
        getStyleClass().add("fonticon");
        textProperty().bind(Bindings.createStringBinding(() -> {
            IconFont c = iconFontProperty().get();
            return c == null ? "" : c.getString();
        }, iconFontProperty()));
        fontProperty().bind(Bindings.createObjectBinding(() -> {
            IconFont c = iconFontProperty().get();
            return c == null ? Font.getDefault() : Font.font(icon.getFontName(), sizeProperty().getValue());
        } , sizeProperty(), iconFontProperty()));
        getStyleClass().addAll(styles);
        
        if (tr != null) {
            tr.applyTransition(this);
        }        
    }
    
    private DoubleProperty size;    
    public final DoubleProperty sizeProperty() { return size; }
    public final void setSize(double value) { sizeProperty().setValue(value); }
    public final double getSize() { return size.getValue(); }        
    
    private ObjectProperty<T> icon;
    public final ObjectProperty<T> iconFontProperty() { return icon; }
    public final void setIconFont(T value) { iconFontProperty().setValue(value); }
    public final T getIconFont() { return icon.getValue(); }    
}
