package org.bithus.cafe;

/**
 * Created by michal on 13.07.16.
 */
public class Cafe {

    private int beansInStock = 0;
    private int milkInStock = 0;

    public Coffee brew(CoffeeType coffeeType) {return brew(coffeeType, 1);}

    private Coffee brew(CoffeeType coffeeType, int quantity) {
        requirePositiveQuantity(quantity);

        int requiredBeans = coffeeType.getRequiredBeans() * quantity;
        int requiredMilk = coffeeType.getRequiredMilk() * quantity;
        if (requiredBeans > beansInStock || requiredMilk > milkInStock) {
            throw new IllegalStateException("Not enough milk or beans.");
        }

        beansInStock -= requiredBeans;
        milkInStock -= requiredMilk;

        return new Coffee(coffeeType, requiredBeans, requiredMilk);

    }

    public void restockBeans(int weightInGrams) {
        requirePositiveQuantity(weightInGrams);
        beansInStock += weightInGrams;
    }

    public void restockMilk(int weightInGrams) {
        requirePositiveQuantity(weightInGrams);
        milkInStock += weightInGrams;
    }

    private void requirePositiveQuantity(int quantity) {
        if (quantity < 1) {
            throw new IllegalArgumentException();
        }
    }

    public int getBeansInStock() {
        return beansInStock;
    }

    public int getMilkInStock() {
        return milkInStock;
    }
}
