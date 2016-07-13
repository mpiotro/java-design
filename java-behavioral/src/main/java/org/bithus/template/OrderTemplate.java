package org.bithus.template;

/**
 * Created by michal on 30.06.16.
 */
public abstract class OrderTemplate {

    public boolean isGift;
    public abstract void doCheckout();
    public abstract void doPayment();
    public abstract void doReceipt();
    public abstract void doDelivery();

    public final void wrapGift() {
        System.out.println("Gift was wrapped.");
    }

    public final void processOrder() {
        doCheckout();
        doPayment();
        if(isGift) {
            wrapGift();
        }
        else {
            doReceipt();
        }

        doDelivery();
    }

}