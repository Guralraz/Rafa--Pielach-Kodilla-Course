package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testCalculations() {
        //Given

        //When
        double addition = calculator.add(1,1);
        double subtraction = calculator.subtract(1,1);
        double multiplication = calculator.multiply(1,1);
        double division = calculator.divide(1,1);

        //Then
        assertEquals(addition, 2);
        assertEquals(subtraction, 0);
        assertEquals(multiplication, 1);
        assertEquals(division,1);
    }

}
