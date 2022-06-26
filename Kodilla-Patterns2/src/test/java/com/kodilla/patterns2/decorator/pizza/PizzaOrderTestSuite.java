package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void pizzaOrderTest() {
        //Given
        PizzaOrder basicPizzaOrder = new BasicPizzaOrder();

        //When
        BigDecimal cost = basicPizzaOrder.getCost();
        String description = basicPizzaOrder.getDescription();

        //Then
        assertEquals(BigDecimal.valueOf(15), cost);
        assertEquals("Pizza with marinara sauce and mozzarella cheese", description);
    }

    @Test
    void pizzaOrderWithExtraIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ChorizoDecorator(pizzaOrder);
        pizzaOrder = new PortobelloDecorator(pizzaOrder);
        pizzaOrder = new DoubleCheeseDecorator(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals(BigDecimal.valueOf(31), cost);
        assertEquals("Pizza with marinara sauce and mozzarella cheese, chorizo, portobello mushrooms, extra cheese", description);
    }

}
