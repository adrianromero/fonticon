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
import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.scene.CacheHint;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

/**
 *
 * @author adrian
 */
public class Rotate implements IconDecorator {
    @Override
    public void decorate(Shape s) {
        s.setCacheHint(CacheHint.ROTATE);
        RotateTransition rt = new RotateTransition(Duration.millis(1000), s);
        rt.setFromAngle(0);
        rt.setToAngle(360);
        rt.setCycleCount(Animation.INDEFINITE);
        rt.setInterpolator(Interpolator.LINEAR);
        rt.play();    
    }  
}
