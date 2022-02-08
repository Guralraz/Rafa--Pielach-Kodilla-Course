package com.kodilla.good_patterns.challenges;

public class Shoes implements Product {

    private String model;

    public Shoes(String model) {
        this.model = model;
    }

    public String getProduct() {
        return model;
    }
}
