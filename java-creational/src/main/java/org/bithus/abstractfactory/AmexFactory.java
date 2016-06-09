package org.bithus.abstractfactory;

/**
 * Created by michal on 09.06.16.
 */
public class AmexFactory extends CreditCardFactory {


    @Override
    public CreditCard getCreditCard(CardType cardType) {

        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();

            case PLATINIUM:
                return new AmexPlatinumCreditCard();
        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {

        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();

            case PLATINIUM:
                return new AmexPlatinumValidator();
        }

        return null;
    }
}
