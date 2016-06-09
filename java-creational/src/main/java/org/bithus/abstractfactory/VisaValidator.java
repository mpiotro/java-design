package org.bithus.abstractfactory;

/**
 * Created by michal on 09.06.16.
 */
public class VisaValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
