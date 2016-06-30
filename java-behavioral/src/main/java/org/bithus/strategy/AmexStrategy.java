package org.bithus.strategy;

/**
 * Created by michal on 30.06.16.
 */
public class AmexStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;

        isValid = creditCard.getNumber().startsWith("37") || creditCard.getNumber().startsWith("34");

        if(isValid) {
            isValid = creditCard.getNumber().length() == 15;
        }

        if(isValid) {
            isValid = passedLuhn(creditCard.getNumber());
        }

        return isValid;
    }

}
