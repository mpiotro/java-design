package org.bithus.bridge.shape;

/**
 * Created by michal on 09.06.16.
 */
public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
