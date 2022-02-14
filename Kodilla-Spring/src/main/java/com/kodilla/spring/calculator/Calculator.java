package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        double value = a + b;
        return display.displayValue(value);
    }

    public double subtract(double a, double b) {
        double value =  a - b;
        return display.displayValue(value);
    }

    public double multiply(double a, double b) {
        double value = a * b;
        return display.displayValue(value);
    }

    public double divide(double a, double b) {
        double value = a / b;
        return display.displayValue(value);
    }

}
