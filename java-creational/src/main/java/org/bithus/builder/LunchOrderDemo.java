package org.bithus.builder;

/**
 * Created by michal on 08.06.16.
 */
public class LunchOrderDemo {

    public static void main(String args[]) {

        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Wheat").condiments("Lettuce").meat("Beef");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }

}
