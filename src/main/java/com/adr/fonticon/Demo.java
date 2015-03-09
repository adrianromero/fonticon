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

import com.adr.fonticon.transitions.IconRotate;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
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
        
        FlowPane flow = new FlowPane();
        flow.setVgap(6);
        flow.setHgap(6);
        flow.setPadding(new Insets(6));
        flow.setPrefWrapLength(100); // preferred width = 300
        flow.setPrefSize(650.0, 500.0);
        
        flow.getChildren().addAll(
                createButton(IconBuilder.create(IonIcons.ION_LOADING_A, 48.0).iconTransition(new IconRotate()).build()),
                createButton(IconBuilder.create(FontAwesome.FA_ANDROID, 48.0).classes("fi-iconred", "fi-plain").build()),
                createButton(IconBuilder.create(FontAwesome.FA_BANK, 48.0).classes("fi-shadow", "fi-iconmediumblue").build()),
                createButton(IconBuilder.create(FontAwesome.FA_APPLE, 48.0).classes("fi-iconwhite", "fi-shadow").build()),
                createButton(IconBuilder.create(FontAwesome.FA_BELL, 48.0).classes("fi-iconwhite", "fi-plain", "fi-dropshadow").build()),
                createButton(IconBuilder.create(FontAwesome.FA_FILTER, 48.0).classes("fi-icongreen", "fi-shadow").build()),                
                createButton(IconBuilder.create(FontAwesome.FA_BOMB, 48.0).classes("fi-iconred", "fi-shadow").build()),
                createButton(IconBuilder.create(IonIcons.ION_ALERT, 48.0).classes("fi-iconblue", "fi-shadow").build()),
                createButton(IconBuilder.create(OpenIconic.ACCOUNT_LOGIN, 48.0).classes("fi-iconyellow", "fi-shadow").build()),
                createButton(IconBuilder.create(Octicons.OCTICON_ALERT, 48.0).classes("fi-iconcyan", "fi-shadow").build()),
                createButton(IconBuilder.create(WeatherIcons.WI_CLOUDY, 48.0).classes("fi-iconwhite", "fi-shadow").build()),                
                createButton("Stacked test 1", new StackPane(
                        IconBuilder.create(FontAwesome.FA_SQUARE, 48.0).classes("fi-icondarkblue", "fi-stack-base").build(),
                        IconBuilder.create(FontAwesome.FA_REFRESH, 32.0).classes("fi-iconwhite", "fi-plain").build())),
                createButton("Stacked test 2", new StackPane(                        
                        IconBuilder.create(FontAwesome.FA_CIRCLE_THIN, 48.0).classes("fi-iconblack", "fi-plain").build(),
                        new Label("31")))
                );
        
        ScrollPane p = new ScrollPane();
        p.setContent(flow);
        Tab t = new Tab("Styles");
        t.setClosable(false);
        t.setContent(p);
        tabpane.getTabs().add(t);
        
        addFontIcon(tabpane, FontAwesome.class.getSimpleName(), FontAwesome.values());
        addFontIcon(tabpane, IonIcons.class.getSimpleName(), IonIcons.values());
        addFontIcon(tabpane, Octicons.class.getSimpleName(), Octicons.values());
        addFontIcon(tabpane, OpenIconic.class.getSimpleName(), OpenIconic.values());
        addFontIcon(tabpane, WeatherIcons.class.getSimpleName(), WeatherIcons.values());
        addFontIcon(tabpane, Material.class.getSimpleName(), Material.values());
        addFontIcon(tabpane, Holo.class.getSimpleName(), Holo.values());

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
        flow.setPrefWrapLength(100);
        flow.setPrefSize(650.0, 500.0);
        
        for (IconFont icon : icons) {
            flow.getChildren().add(createButton(IconBuilder.create(icon, 48.0).build()));
        }    
        
        ScrollPane p = new ScrollPane();
        p.setContent(flow);
        Tab t = new Tab(name);
        t.setClosable(false);
        t.setContent(p);
        tabpane.getTabs().add(t);        
    }
    
    private Button createButton(Node graph) {
        return createButton((String) graph.getProperties().get("ICONLABEL"), graph);
    }
    
    private Button createButton(String text, Node graph) {
        Button b = new Button(text, graph);
        b.setMinSize(200.0, 120.0);
        b.setMaxSize(200.0, 120.0);
        b.setPrefSize(200.0, 120.0);
        b.setContentDisplay(ContentDisplay.TOP);
        return b;
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }    
}
