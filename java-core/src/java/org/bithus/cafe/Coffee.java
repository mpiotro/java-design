package org.bithus.cafe;

/**
 * Created by michal on 13.07.16.
 */
public class Coffee {

    private final CoffeeType type;
    private final int beans;
    private final int milk;

    public Coffee(CoffeeType type, int beans, int milk) {
        this.type = type;
        this.beans = beans;
        this.milk = milk;
    }

    public CoffeeType getType() {
        return type;
    }

    public int getBeans() {
        return beans;
    }

    public int getMilk() {
        return milk;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Coffee{");
        builder.append("type-"+type);
        builder.append("beans-"+beans);
        builder.append("milk-"+milk);
        builder.append("}");

        return builder.toString();
    }
}
