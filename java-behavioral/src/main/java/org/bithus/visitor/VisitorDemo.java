package org.bithus.visitor;

/**
 * Created by michal on 30.06.16.
 */
public class VisitorDemo {

    public static void main(String[] args) {

        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());
        
        order.accept(new AtvPartShippingvisitor());

    }

}
