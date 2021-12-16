package com.kodilla.testing.composition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputerTest {

    @Test
    void test() {
        Computer computer = new Computer(new Processor("i5", 6));
        computer.showProcessorName();

        double d = 10.49999;
        assertEquals(10.5, d, 0.1);
    }

}