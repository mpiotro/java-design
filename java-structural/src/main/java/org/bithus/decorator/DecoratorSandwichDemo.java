package org.bithus.decorator;

/**
 * Created by michal on 17.06.16.
 */
public class DecoratorSandwichDemo {

    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
