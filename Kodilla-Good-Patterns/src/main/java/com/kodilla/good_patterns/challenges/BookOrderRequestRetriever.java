package com.kodilla.good_patterns.challenges;

public class BookOrderRequestRetriever implements OrderRequestRetriever {

    public OrderRequest retrieve(String userName, String name) {
        User user = new User(userName);
        Book book = new Book(name);
        return new OrderRequest(user, book);
    }

}
