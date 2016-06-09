package org.bithus.abstractfactory;

/**
 * Created by michal on 09.06.16.
 */
public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
