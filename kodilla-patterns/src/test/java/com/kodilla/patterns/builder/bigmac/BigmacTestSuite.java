package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Plain")
                .burgers(3)
                .sauce("Spicy")
                .ingredient("Cheese")
                .ingredient("Tomato")
                .ingredient("Onions")
                .build();
        System.out.println(bigmac);
        //When
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyBurgers);
        Assert.assertEquals(3, howManyIngredients);

    }
}