//    FontIcon is a JavaFX library to use FontIcons
//    Copyright (C) 2014-2019 Adrián Romero Corchado.
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

import com.adr.fonticon.decorator.FillPaint;
import com.adr.fonticon.decorator.Shine;
import javafx.geometry.VPos;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author adrian
 */
public class IconBuilder {
    
    private Text icon;
    
    public static IconBuilder create(IconFont iconf, double size) {
        
        IconBuilder builder = new IconBuilder();
        builder.icon = new Text(iconf.getText());
        builder.icon.setTextOrigin(VPos.TOP);
        builder.icon.getProperties().put("ICONLABEL", iconf.toString());
        builder.icon.setFont(Font.font(iconf.getFontName(), size));
        return builder;        
    }   
    
    public static IconBuilder create(IconFont icon) {
        return create(icon, 14.0);
    }   
    
    public Text build() {
        return icon;
    }
    
    public IconBuilder styleClass(String styleClass) {
        icon.getStyleClass().add(styleClass);
        return this;
    }
    
    public IconBuilder fill(Paint fill) {
        return apply(new FillPaint(fill));
    }
    
    public IconBuilder color(Color color) {
        return apply(new FillPaint(color));
    }
    
    public IconBuilder shine(Color color) {
        return apply(new Shine(color));
    }
    
    public IconBuilder apply(IconDecorator visitor) {
        visitor.decorate(icon);
        return this;
    }
}
