package org.bithus.decorator;

/**
 * Created by michal on 17.06.16.
 */
public class MeatDecorator extends SandwichDecorator {


    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make() {
        return customSandwich.make() + addMeat();
    }

    private String addMeat() {
        return " + Turkey";
    }

}
