package org.bithus.cafe;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by michal on 13.07.16.
 */
public class CafeTest {

    @Test
    public void canBrewEspresso() {

        // given
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

        // when
        Coffee coffee = cafe.brew(CoffeeType.Esspresso);

        // then
        Assert.assertEquals(CoffeeType.Esspresso, coffee.getType());
        Assert.assertEquals(0, coffee.getMilk());
        Assert.assertEquals(7, coffee.getBeans());

    }

    @Test
    public void brewingEspressoConsumesBeans() {

        // given
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

        // when
        Coffee coffee = cafe.brew(CoffeeType.Esspresso);

        // then
        Assert.assertEquals(0, cafe.getBeansInStock());

    }


}
