package com.kodilla.good_patterns.challenges;

public class ShoesOrderRequestRetriever implements OrderRequestRetriever {

    public OrderRequest retrieve(String userName, String name) {
        User user = new User(userName);
        Shoes shoes = new Shoes(name);
        return new OrderRequest(user, shoes);
    }
}
