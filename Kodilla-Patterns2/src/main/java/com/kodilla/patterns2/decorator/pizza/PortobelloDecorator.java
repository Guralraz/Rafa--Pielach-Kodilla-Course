package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PortobelloDecorator extends AbstractPizzaOrderDecorator {

    public PortobelloDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", portobello mushrooms";
    }

}
