package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacCreator() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("plain bun")
                .burgers(2)
                .sauce("standard")
                .ingredients("lettuce")
                .ingredients("onion")
                .ingredients("bacon")
                .ingredients("cucumber")
                .ingredients("cheese")
                .build();

        //When
        int ingredientsAmount = bigmac.getIngredients().size();

        //Then
        System.out.println(bigmac);
        assertEquals(5, ingredientsAmount);
        assertEquals("lettuce", bigmac.getIngredients().get(0));
        assertEquals("onion", bigmac.getIngredients().get(1));
        assertEquals("bacon", bigmac.getIngredients().get(2));
        assertEquals("cucumber", bigmac.getIngredients().get(3));
        assertEquals("cheese", bigmac.getIngredients().get(4));
    }

}
