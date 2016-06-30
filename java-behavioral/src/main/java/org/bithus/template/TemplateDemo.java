package org.bithus.template;

/**
 * Created by michal on 30.06.16.
 */
public class TemplateDemo {

    public static void main(String[] args) {

        System.out.println("Web order:");

        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        System.out.println("\nStore order:");

        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();

    }

}
