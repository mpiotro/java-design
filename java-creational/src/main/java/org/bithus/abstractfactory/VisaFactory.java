package org.bithus.abstractfactory;

/**
 * Created by michal on 09.06.16.
 */
public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:

                return new VisaGoldCreditCard();

            case PLATINIUM:

                return new VisaBlackCreditCard();
        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }
}
