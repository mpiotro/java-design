package org.bithus.bridge.shape;

import org.bithus.bridge.shape.Color;

/**
 * Created by michal on 09.06.16.
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();

}
