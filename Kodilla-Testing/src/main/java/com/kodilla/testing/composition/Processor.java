package com.kodilla.testing.composition;

public class Processor {

    private String name;
    private int coreQuantity;

    public Processor(String name, int coreQuantity) {
        this.name = name;
        this.coreQuantity = coreQuantity;
    }

    public String getName() {
        return name;
    }

    public int getCoreQuantity() {
        return coreQuantity;
    }
}
