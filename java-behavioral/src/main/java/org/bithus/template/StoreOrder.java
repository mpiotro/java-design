package org.bithus.template;

/**
 * Created by michal on 30.06.16.
 */
public class StoreOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("Ring up items from cart.");
    }

    @Override
    public void doPayment() {
        System.out.println("process payment with Card present.");
    }

    @Override
    public void doReceipt() {
        System.out.println("Print receipt.");
    }

    @Override
    public void doDelivery() {
        System.out.println("Bag items at counter.");
    }
}
