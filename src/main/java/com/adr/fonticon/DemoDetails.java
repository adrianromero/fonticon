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

import com.adr.fonticon.decorator.LightOff;
import com.adr.fonticon.decorator.LightOn;
import com.adr.fonticon.decorator.ShadowHigh;
import com.adr.fonticon.decorator.ShadowHole;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 *
 * @author adrian
 */
public class DemoDetails {

    private final Label title;
    private final HBox sizer;
    private final HBox sizer2;
    private final VBox box;

    public DemoDetails() {
        title = new Label();
        title.getStyleClass().add("title-icon");

        sizer = new HBox();
        sizer.getStyleClass().add("sizer-icon");

        sizer2 = new HBox();
        sizer2.getStyleClass().add("sizer-icon");

        box = new VBox(title, sizer, sizer2);
    }

    public Node getNode() {
        return box;
    }

    public void clear() {
        title.setText("");
        sizer.getChildren().clear();
        sizer2.getChildren().clear();
    }

    public void displayDetails(IconFont icon) {
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
    }
}
