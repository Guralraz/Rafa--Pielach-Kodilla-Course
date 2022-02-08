package com.kodilla.good_patterns.challenges;

public class OrderDTO {

    private User user;

    private Product product;

    private boolean isOrdered;

    public OrderDTO(User user, Product product, boolean isOrdered) {
        this.user = user;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

}
