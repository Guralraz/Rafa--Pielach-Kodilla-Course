package com.kodilla.testing.composition;

public class Computer {

    private Processor processor;

    public Computer(Processor processor) {
        this.processor = processor;
    }

    public void showProcessorName() {
        System.out.println(processor.getName());
    }

}
