//    FontIcon is a JavaFX library to use FontIcons
//    Copyright (C) 2015 Adrián Romero Corchado.
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
//     limitations under the License

package com.adr.fonticon.decorator;

import com.adr.fonticon.IconDecorator;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

/**
 *
 * @author adrian
 */
public class LightOff implements IconDecorator {
    
    private final Color fill;
    
    public LightOff(Color fill) {
        this.fill = fill;
    }
    
    public LightOff() {
        this(Color.DARKGREY);
    }
    
    @Override
    public void decorate(Shape s) {
        s.setFill(fill);
        s.setStrokeWidth(1.0);
        s.setStroke(Color.GREY);
    }
}
