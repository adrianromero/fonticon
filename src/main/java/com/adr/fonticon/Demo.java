//    FontIcon is a JavaFX library to use FontIcons
//    Copyright (C) 2014-2020 Adrián Romero Corchado.
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

import com.adr.fonticon.decorator.LightOff;
import com.adr.fonticon.decorator.LightOn;
import com.adr.fonticon.decorator.ShadowHigh;
import com.adr.fonticon.decorator.ShadowHole;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author adrian
 */
public class Demo extends Application {

    @Override
    public void start(Stage stage) {

        Scene scene = new Scene(getFontIconNode(IconFontGlyph.values()));
        scene.getStylesheets().add(getClass().getResource("/com/adr/fonticon/style/browser.css").toExternalForm());
        stage.setTitle("Icon Font");
        stage.setScene(scene);
        stage.show();
    }

    private EventHandler<ActionEvent> displayDetails(IconFont icon, Label title, HBox sizer, HBox sizer2) {
        return (ActionEvent ev) -> {
            title.setText(icon.toString());
            sizer.getChildren().clear();
            sizer.getChildren().addAll(
                    IconBuilder.create(icon, 12.0).styleClass("icon-size").build(),
                    IconBuilder.create(icon, 16.0).styleClass("icon-size").build(),
                    IconBuilder.create(icon, 20.0).styleClass("icon-size").build(),
                    IconBuilder.create(icon, 24.0).styleClass("icon-size").build(),
                    IconBuilder.create(icon, 28.0).styleClass("icon-size").build(),
                    IconBuilder.create(icon, 32.0).styleClass("icon-size").build(),
                    IconBuilder.create(icon, 40.0).styleClass("icon-size").build(),
                    IconBuilder.create(icon, 48.0).styleClass("icon-size").build(),
                    IconBuilder.create(icon, 52.0).styleClass("icon-size").build(),
                    IconBuilder.create(icon, 56.0).styleClass("icon-size").build()
            );
            sizer2.getChildren().clear();
            sizer2.getChildren().addAll(
                    IconBuilder.create(icon, 52.0).color(Color.LIGHTGRAY).shine(Color.YELLOW).build(),
                    IconBuilder.create(icon, 52.0).apply(new LightOn(Color.AQUA)).build(),
                    IconBuilder.create(icon, 52.0).apply(new LightOff()).build(),
                    IconBuilder.create(icon, 52.0).color(Color.RED).apply(new ShadowHigh(Color.BLUE)).build(),
                    IconBuilder.create(icon, 52.0).apply(new ShadowHole(Color.AZURE)).build()
            );
        };
    }

    private Parent getFontIconNode(IconFont[] icons) {

        FlowPane flow = new FlowPane();
        flow.getStyleClass().add("flow-icon");
        flow.setPrefSize(800.0, 480.0);

        ScrollPane p = new ScrollPane(flow);
        p.setFitToWidth(true);
        p.setFocusTraversable(false);
        VBox.setVgrow(p, Priority.ALWAYS);

        Label title = new Label();
        title.getStyleClass().add("title-icon");

        HBox sizer = new HBox();
        sizer.getStyleClass().add("sizer-icon");

        HBox sizer2 = new HBox();
        sizer2.getStyleClass().add("sizer-icon");

        VBox box = new VBox(p, title, sizer, sizer2);

        boolean clean = true;
        for (IconFont icon : icons) {
            EventHandler<ActionEvent> handler = displayDetails(icon, title, sizer, sizer2);
            if (clean) {
                clean = false;
                handler.handle(new ActionEvent());
            }
            flow.getChildren().add(createButton(IconBuilder.create(icon, 28.0).styleClass("icon-fill").build(), handler));
        }

        return box;
    }

    private Button createButton(Node graph, EventHandler<ActionEvent> ev) {
        return createButton((String) graph.getProperties().get("ICONLABEL"), graph, ev);
    }

    private Button createButton(String text, Node graph, EventHandler<ActionEvent> ev) {
        Button b = new Button(text, graph);
        b.getStyleClass().add("button-icon");
        b.setContentDisplay(ContentDisplay.TOP);
        b.setMnemonicParsing(false);
        b.setFocusTraversable(false);
        b.setOnAction(ev);
        return b;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
