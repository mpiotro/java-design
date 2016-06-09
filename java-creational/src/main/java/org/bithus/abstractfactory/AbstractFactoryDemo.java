package org.bithus.abstractfactory;

/**
 * Created by michal on 09.06.16.
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(750);
        CreditCard creditCard1 = abstractFactory.getCreditCard(CardType.PLATINIUM);

        System.out.println(creditCard1.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard creditCard2 = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(creditCard2.getClass());

    }

}
