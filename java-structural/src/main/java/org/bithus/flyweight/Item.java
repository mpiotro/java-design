package org.bithus.flyweight;

/**
 * Created by michal on 23.06.16.
 */
public class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
