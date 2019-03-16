//    FontIcon is a JavaFX library to use FontIcons
//    Copyright (C) 2016-2019 Adrián Romero Corchado.
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

import java.awt.Font;

/**
 *
 * @author adrian
 */
public class IconFontText implements IconFont {
    
    private final String text;
    private final String name;
    
    public IconFontText(String text, String name) {
        this.text = text;
        this.name = name;
    }
    
    public IconFontText(String text) {
        this(text, Font.MONOSPACED);
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getFontName() {
        return name;
    }
}
