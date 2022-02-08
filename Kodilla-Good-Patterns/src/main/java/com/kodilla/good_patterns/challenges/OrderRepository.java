package com.kodilla.good_patterns.challenges;

public class OrderRepository implements ProductOrderRepository {

    public boolean createOrderEntry(User user, Product product) {
        if (user != null && product != null) {
            System.out.println("Entry of: (User: " + user.getUserName() + ", Product bought: " + product.getProduct() + ") has been created");
            return true;
        } else {
            System.out.println("Invalid request");
            return false;
        }
    }

}
