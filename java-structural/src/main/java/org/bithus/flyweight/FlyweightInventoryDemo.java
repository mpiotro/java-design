package org.bithus.flyweight;

/**
 * Created by michal on 23.06.16.
 */
public class FlyweightInventoryDemo {

    public static void main(String[] args) {

        InventorySystem ims = new InventorySystem();

        ims.takeOrder("Sennheiser HD598", 221);
        ims.takeOrder("Bose Headphones", 361);
        ims.takeOrder("Samsung TV", 432);
        ims.takeOrder("Samsung TV", 323);
        ims.takeOrder("Sennheiser HD598", 536);
        ims.takeOrder("Bose Headphones", 362);
        ims.takeOrder("Samsung TV", 433);
        ims.takeOrder("Samsung TV", 324);
        ims.takeOrder("Sennheiser HD598", 537);
        ims.takeOrder("Bose Headphones", 369);

        ims.process();

        System.out.println(ims.report());


    }

}
