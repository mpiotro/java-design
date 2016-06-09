package org.bithus.bridge.shape;

/**
 * Created by michal on 09.06.16.
 */
public class Shape1BridgeDemo {

    public static void main(String[] args) {

        Color blue = new Blue();
        Shape blueCircle = new Circle(blue);

        Color red = new Red();
        Shape redSquare = new Square(red);

        Color green = new Green();
        Shape greenCircle = new Circle(green);

        blueCircle.applyColor();
        redSquare.applyColor();
        greenCircle.applyColor();

    }

}
