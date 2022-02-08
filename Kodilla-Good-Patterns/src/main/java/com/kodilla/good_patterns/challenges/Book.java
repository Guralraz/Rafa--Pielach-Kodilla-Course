package com.kodilla.good_patterns.challenges;

public class Book implements Product {

    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getProduct() {
        return title;
    }

}
