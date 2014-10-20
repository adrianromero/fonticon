//    FontAwesome is a JavaFX library to use Fontawesome
//    Copyright (C) 2014 Adrián Romero Corchado.
//
//    This file is part of FontAwesome
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

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author adrian
 */
public class Demo extends Application {

    @Override public void start(Stage stage) {
        FlowPane pane = new FlowPane();
               
        pane.getChildren().addAll(
                new Icon(FontAwesome.FA_ANDROID, 48.0, "fa-iconred", "fa-shadow"),
                new Icon(FontAwesome.FA_BANK, 48.0, "fa-iconblue", "fa-shadow"),
                new Icon(FontAwesome.FA_FILTER, 48.0, "fa-icongreen", "fa-shadow"),
                new Button(null, new Icon(FontAwesome.FA_APPLE, 48.0, "fa-iconwhite", "fa-shadow")),
                new Button("test", new Icon(FontAwesome.FA_BELL, 48.0, "fa-iconblue", "fa-plain", "fa-dropshadow")),
                new Button("test", new StackPane(
                        new Icon(FontAwesome.FA_SQUARE, 48.0, "fa-icondarkblue", "fa-stack-base"),
                        new Icon(FontAwesome.FA_REFRESH, 32.0, "fa-iconwhite", "fa-shadow"))),
                new Button("test", new Icon(FontAwesome.FA_BOMB, 48.0, "fa-iconred", "fa-shadow")),
                new Button("test", new StackPane(                        
                        new Icon(FontAwesome.FA_CALENDAR_O, 48.0, "fa-icondarkblue"),
                        new Label("31"))),
                
                new Button("Ion Icon Alert", new Icon(IonIcons.ION_ALERT, 48.0, "fa-iconwhite", "fa-shadow")),
                new Button("Open Iconic Account Login", new Icon(OpenIconic.ACCOUNT_LOGIN, 48.0, "fa-iconwhite", "fa-shadow")),
                new Button("Octicon Alert", new Icon(Octicons.OCTICON_ALERT, 48.0, "fa-iconwhite", "fa-shadow"))
                );

        Scene scene = new Scene(pane);        
        scene.getStylesheets().add(StylesGallery.BASE.getPath());

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }    
}
