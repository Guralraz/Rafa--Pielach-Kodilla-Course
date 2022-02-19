package com.kodilla.patterns.strategy.social;

public class GenerationZ extends User {

    public GenerationZ(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }

}
