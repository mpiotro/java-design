package org.bithus.decorator;

/**
 * Created by michal on 17.06.16.
 */
public class SimpleSandwich implements Sandwich {

    @Override
    public String make() {
        return "Bread";
    }
}
