package org.bithus.cafe;

/**
 * Created by michal on 13.07.16.
 */
public enum CoffeeType {
    Esspresso(7,0),
    Latte(7, 227),
    FilterCoffe(10,0);

    int requiredBeans;
    int requiredMilk;

    CoffeeType(int requiredBeans, int requiredMilk) {
        this.requiredBeans = requiredBeans;
        this.requiredMilk = requiredMilk;
    }

    public int getRequiredBeans() {
        return requiredBeans;
    }

    public int getRequiredMilk() {
        return requiredMilk;
    }
}
