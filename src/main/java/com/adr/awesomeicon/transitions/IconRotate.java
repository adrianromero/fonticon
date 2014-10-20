/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adr.awesomeicon.transitions;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 *
 * @author adrian
 */
public class IconRotate extends IconTransition {

    @Override
    public void applyTransition(Node node) {
        RotateTransition rt = new RotateTransition(Duration.millis(1000), node);
        rt.setByAngle(360);
        rt.setCycleCount(Animation.INDEFINITE);
        rt.setInterpolator(Interpolator.LINEAR);
        rt.play();
    }   
}
