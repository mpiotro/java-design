package org.bithus.strategy;

/**
 * Created by michal on 30.06.16.
 */
public class VisaStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;

        isValid = creditCard.getNumber().startsWith("4");

        if(isValid) {
            isValid = creditCard.getNumber().length() == 16;
        }

        if(isValid) {
            isValid = passedLuhn(creditCard.getNumber());
        }

        return isValid;
    }
}
