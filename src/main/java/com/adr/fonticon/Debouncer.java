//    FontIcon is a JavaFX library to use FontIcons
//    Copyright (C) 2020 Adrián Romero Corchado.
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

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;

/**
 *
 * @author adrian
 */
public class Debouncer {

    private Duration d;
    private EventHandler<ActionEvent> handler;

    private Timeline tl = null;

    public Debouncer(Duration d, EventHandler<ActionEvent> handler) {
        this.d = d;
        this.handler = handler;
    }

    public void play() {
        if (tl != null) {
            tl.stop();
        }
        tl = new Timeline(new KeyFrame(d, ev -> {
            tl = null;
            handler.handle(ev);
        }));
        tl.play();
    }

}
