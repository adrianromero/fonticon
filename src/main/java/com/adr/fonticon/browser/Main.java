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
package com.adr.fonticon.browser;

import com.adr.fonticon.IconBuilder;
import com.adr.fonticon.IconFont;
import com.adr.fonticon.IconFontGlyph;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author adrian
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Scene scene = new Scene(createBrowser(IconFontGlyph.values()));
        scene.getStylesheets().add(getClass().getResource("/com/adr/fonticon/style/browser.css").toExternalForm());
        stage.setTitle("Icon Font Browser");
        stage.setScene(scene);
        stage.show();
    }

    private EventHandler<ActionEvent> displayDetails(IconFont icon, IconDetails details) {
        return (ActionEvent ev) -> {
            details.displayDetails(icon);
        };
    }

    private Parent createBrowser(IconFont[] icons) {

        TextField search = new TextField();
        search.setPromptText("search...");
        search.getStyleClass().add("search");

        VBox searchcontainer = new VBox(search);
        searchcontainer.getStyleClass().add("search-container");

        FlowPane flow = new FlowPane();
        flow.getStyleClass().add("flow-icon");
        flow.setPrefSize(820.0, 480.0);

        ScrollPane p = new ScrollPane(flow);
        p.setFitToWidth(true);
        p.setFocusTraversable(false);
        VBox.setVgrow(p, Priority.ALWAYS);

        IconDetails details = new IconDetails();

        VBox box = new VBox(searchcontainer, p, details.getNode());

        // Bind actions
        Debouncer deb = new Debouncer(Duration.millis(250.0), ev -> {
            filter(flow, details, icons, search.getText());
        });
        search.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            deb.play();
        });

        // Execute initial action
        filter(flow, details, icons, search.getText());

        return box;
    }

    private boolean matchesFilter(IconFont icon, String filter) {

        if (filter == null) {
            return true;
        }
        String[] filters = filter.split("\\s+");
        if (filters.length == 0) {
            return true;
        }
        for (String s : filters) {
            if (!matchesAnyTerm(icon.toString(), icon.getTerms(), s.toUpperCase())) {
                return false;
            }
        }
        return true;
    }

    private boolean matchesAnyTerm(String name, String[] terms, String ucasefilter) {
        if (name.toUpperCase().contains(ucasefilter)) {
            return true;
        }
        for (String t : terms) {
            if (t.toUpperCase().contains(ucasefilter)) {
                return true;
            }
        }
        return false;
    }

    private void filter(FlowPane flow, IconDetails details, IconFont[] icons, String filter) {

        boolean isDetailsClear = true;
        details.clear();
        flow.getChildren().clear();

        for (IconFont icon : icons) {
            if (!matchesFilter(icon, filter)) {
                continue;
            }
            EventHandler<ActionEvent> handler = displayDetails(icon, details);
            if (isDetailsClear) {
                isDetailsClear = false;
                handler.handle(new ActionEvent());
            }
            flow.getChildren().add(createButton(IconBuilder.create(icon, 28.0).styleClass("icon-fill").build(), handler));
        }
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
