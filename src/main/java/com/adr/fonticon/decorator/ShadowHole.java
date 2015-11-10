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
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Shape;

/**
 *
 * @author adrian
 */
public class ShadowHole implements IconDecorator {
    
    private final Color fill;
    
    public ShadowHole(Color fill) {
        this.fill = fill;
    }
    
    @Override
    public void decorate(Shape s) {  
    
        InnerShadow shadow = new InnerShadow();
        shadow.setColor(fill.deriveColor(1.0, 1.0, 0.7, 1.0));
        shadow.setBlurType(BlurType.THREE_PASS_BOX);
        shadow.setRadius(2.0);
        shadow.setChoke(0.0);
        shadow.setOffsetX(1.0);
        shadow.setOffsetY(1.0);
        s.setEffect(shadow);

        LinearGradient gradient = new LinearGradient(0.0, 0.0, 0.0, 1.0, true, CycleMethod.NO_CYCLE, 
                new Stop(0.1, fill.deriveColor(1.0, 1.0, 1.2, 1.0)),
                new Stop(0.9, fill.deriveColor(1.0, 1.0, 0.7, 1.0)));
        s.setFill(gradient);
    }
}
