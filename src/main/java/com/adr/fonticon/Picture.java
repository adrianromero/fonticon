//    FontIcon is a JavaFX library to use FontIcons
//    Copyright (C) 2018-2019 Adrián Romero Corchado.
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
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author adrian
 */
public class Picture extends Text {
    private IconFontGlyph iconf = null;
    private Color color = null;
    private Color shine = null;
    
    public Picture() {
        setTextOrigin(VPos.TOP);   
    }

    public IconFontGlyph getIconFontGlyph() {
        return iconf;
    }
    
    public void setIconFontGlyph(IconFontGlyph iconf) {
        getProperties().put("ICONLABEL", iconf.toString());
        setText(iconf.getText());
        setFont(Font.font(iconf.getFontName(), getFont().getSize()));
    }    
    
    public void setSize(double size) {
        setFont(Font.font(getFont().getFamily(), size));
    }
    
    public double getSize() {
        return getFont().getSize();   
    }
    
    public void setColor(Color color) {
        this.color = color;
        new FillPaint(color).decorate(this);
    }
    
    public Color getColor() {
        return color;
    }
    
    public void setShine(Color shine) {
        this.shine = shine;
        new Shine(color).decorate(this);
    }
    
    public Color getShine() {
        return shine;
    }
}
