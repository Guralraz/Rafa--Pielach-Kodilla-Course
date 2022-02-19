package com.kodilla.patterns.strategy.social;

public class GenerationY extends User {

    public GenerationY(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }

}
