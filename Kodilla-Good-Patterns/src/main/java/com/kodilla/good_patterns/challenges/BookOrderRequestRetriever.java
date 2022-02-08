package com.kodilla.good_patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("IndianGoogleTechSupport69/420");
        Book book = new Book("Door to perception");

        return new OrderRequest(user, book);
    }

}
