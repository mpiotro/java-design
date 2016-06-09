package org.bithus.bridge.shape;

/**
 * Created by michal on 09.06.16.
 */
public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
