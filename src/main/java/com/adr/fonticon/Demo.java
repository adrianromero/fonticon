//    FontIcon is a JavaFX library to use FontIcons
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

package com.adr.fonticon;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author adrian
 */
public class Demo extends Application {

    @Override public void start(Stage stage) {
        
        TabPane tabpane = new TabPane();
        

        
        
        FlowPane pane = new FlowPane();
               
        pane.getChildren().addAll(
                new Icon(FontAwesome.FA_ANDROID, 48.0, "fi-iconred", "fi-shadow"),
                new Icon(FontAwesome.FA_BANK, 48.0, "fi-iconblue", "fi-shadow"),
                new Icon(FontAwesome.FA_FILTER, 48.0, "fi-icongreen", "fi-shadow"),
                new Button(null, new Icon(FontAwesome.FA_APPLE, 48.0, "fi-iconwhite", "fi-shadow")),
                new Button("test", new Icon(FontAwesome.FA_BELL, 48.0, "fi-iconblue", "fi-plain", "fi-dropshadow")),
                new Button("test", new StackPane(
                        new Icon(FontAwesome.FA_SQUARE, 48.0, "fi-icondarkblue", "fi-stack-base"),
                        new Icon(FontAwesome.FA_REFRESH, 32.0, "fi-iconwhite", "fi-shadow"))),
                new Button("test", new Icon(FontAwesome.FA_BOMB, 48.0, "fi-iconred", "fi-shadow")),
                new Button("test", new StackPane(                        
                        new Icon(FontAwesome.FA_CALENDAR_O, 48.0, "fi-icondarkblue"),
                        new Label("31"))),
                
                new Button("Ion Icon Alert", new Icon(IonIcons.ION_ALERT, 48.0, "fi-iconwhite", "fi-shadow")),
                new Button("Open Iconic Account Login", new Icon(OpenIconic.ACCOUNT_LOGIN, 48.0, "fi-iconwhite", "fi-shadow")),
                new Button("Octicon Alert", new Icon(Octicons.OCTICON_ALERT, 48.0, "fi-iconwhite", "fi-shadow")),
                new Button("Weather", new Icon(WeatherIcons.WI_CLOUDY, 48.0, "fi-iconwhite", "fi-shadow"))
                );
        
        
        ScrollPane p = new ScrollPane();
        p.setContent(pane);
        Tab t = new Tab("Styles");
        t.setContent(p);
        tabpane.getTabs().add(t);
        
        addFontIcon(tabpane, FontAwesome.class.getSimpleName(), FontAwesome.values());
        addFontIcon(tabpane, IonIcons.class.getSimpleName(), IonIcons.values());
        addFontIcon(tabpane, Octicons.class.getSimpleName(), Octicons.values());
        addFontIcon(tabpane, OpenIconic.class.getSimpleName(), OpenIconic.values());
        addFontIcon(tabpane, WeatherIcons.class.getSimpleName(), WeatherIcons.values());
        
        

        Scene scene = new Scene(tabpane);        
        scene.getStylesheets().add(StylesGallery.BASE.getPath());

        stage.setScene(scene);
        stage.show();
    }
    
    private void addFontIcon(TabPane tabpane, String name, IconFont[] icons) {
        

        FlowPane flow = new FlowPane();
        flow.setVgap(6);
        flow.setHgap(6);
        flow.setPadding(new Insets(6));
        flow.setPrefWrapLength(100); // preferred width = 300
        flow.setPrefSize(800.0, 400.0);
        
        for (IconFont icon : icons) {
            Button b = new Button(icon.toString(), new Icon(icon, 48.0));
            b.setPrefSize(200.0, 50.0);
            b.setPrefSize(200.0, 50.0);
            b.setPrefSize(200.0, 50.0);
            
            flow.getChildren().add(b);
        }    
        
        ScrollPane p = new ScrollPane();
        p.setContent(flow);
        Tab t = new Tab(name);
        t.setContent(p);
        tabpane.getTabs().add(t);        
    }

    public static void main(String[] args) {
        Application.launch(args);
    }    
}
