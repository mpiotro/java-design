package org.bithus.template;

/**
 * Created by michal on 30.06.16.
 */
public class WebOrder extends OrderTemplate {

    @Override
    public void doCheckout() {
        System.out.println("Get items from cart,");
        System.out.println("Set gift preferences,");
        System.out.println("Set delivery address,");
        System.out.println("Set biling address");
    }

    @Override
    public void doPayment() {
        System.out.println("Process payment without Card present");
    }

    @Override
    public void doReceipt() {
        System.out.println("Email receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("Ship the item to address");
    }
}
