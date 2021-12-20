package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");
        Continent southAmerica = new Continent("South America");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");
        Continent australia = new Continent("Australia");
        Continent antarctica = new Continent("Antarctica");

        //When
        europe.addCountry(new Country("Poland", BigDecimal.valueOf(37950000)));
        europe.addCountry(new Country("Germany", BigDecimal.valueOf(83240000)));
        europe.addCountry(new Country("France", BigDecimal.valueOf(67390000)));
        europe.addCountry(new Country("Spain", BigDecimal.valueOf(47350000)));
        europe.addCountry(new Country("Italy", BigDecimal.valueOf(59550000)));
        europe.addCountry(new Country("United Kingdom", BigDecimal.valueOf(67220000)));
        northAmerica.addCountry(new Country("United States", BigDecimal.valueOf(329500000)));
        northAmerica.addCountry(new Country("Canada", BigDecimal.valueOf(38010000)));
        northAmerica.addCountry(new Country("Mexico", BigDecimal.valueOf(128900000)));
        southAmerica.addCountry(new Country("Argentina", BigDecimal.valueOf(45380000)));
        southAmerica.addCountry(new Country("Brazil", BigDecimal.valueOf(212600000)));
        southAmerica.addCountry(new Country("Chile", BigDecimal.valueOf(19120000)));
        southAmerica.addCountry(new Country("Columbia", BigDecimal.valueOf(50880000)));
        southAmerica.addCountry(new Country("Peru", BigDecimal.valueOf(32970000)));
        asia.addCountry(new Country("China", BigDecimal.valueOf(1402000000)));
        asia.addCountry(new Country("India", BigDecimal.valueOf(1380000000)));
        asia.addCountry(new Country("Japan", BigDecimal.valueOf(125800000)));
        asia.addCountry(new Country("South Korea", BigDecimal.valueOf(51780000)));
        asia.addCountry(new Country("Taiwan", BigDecimal.valueOf(23570000)));
        asia.addCountry(new Country("Turkey", BigDecimal.valueOf(84380000)));
        asia.addCountry(new Country("Iran", BigDecimal.valueOf(83990000)));
        africa.addCountry(new Country("South Africa", BigDecimal.valueOf(59310000)));
        africa.addCountry(new Country("Egypt", BigDecimal.valueOf(102300000)));
        africa.addCountry(new Country("Ethiopia", BigDecimal.valueOf(115000000)));
        africa.addCountry(new Country("Nigeria", BigDecimal.valueOf(206100000)));
        africa.addCountry(new Country("Democratic Republic of Congo", BigDecimal.valueOf(89560000)));
        australia.addCountry(new Country("Australia", BigDecimal.valueOf(25690000)));
        world.addContinents(europe);
        world.addContinents(northAmerica);
        world.addContinents(southAmerica);
        world.addContinents(asia);
        world.addContinents(africa);
        world.addContinents(australia);
        world.addContinents(antarctica);

        //Then
        BigDecimal expectedPeopleNumber = new BigDecimal("4969540000");
        assertEquals(expectedPeopleNumber, world.getPeopleQuantity());
    }

}
