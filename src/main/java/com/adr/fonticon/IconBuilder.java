//    FontIcon is a JavaFX library to use FontIcons
//    Copyright (C) 2014-2015 Adrián Romero Corchado.
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
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author adrian
 */
public class IconBuilder {
    
    private Text icon;
    
    public static IconBuilder create(IconFont icon, double size) {
        
        IconBuilder builder = new IconBuilder();
        builder.icon = new Text();
        builder.icon.setText(icon.getString());
        builder.icon.getProperties().put("ICONLABEL", icon.toString());
        builder.icon.setFont(Font.font(icon.getFontName(), size));
        return builder;        
    }   
    
    public static IconBuilder create(IconFont icon) {
        return create(icon, 14.0);
    }
    
    public Shape build() {
        return this.icon;
    }  
    
    public IconBuilder classes(String... classes) {
        icon.getStyleClass().addAll(classes);
        return this;
    }
    
    public IconBuilder style(String style) {
        icon.setStyle(style);
        return this;
    }
    
    public IconBuilder iconTransition(IconTransition tr) {
        tr.applyTransition(icon);
        return this;
    }  
    
    public IconBuilder apply(IconDecorator visitor) {
        visitor.decorate(icon);
        return this;
    }
}
