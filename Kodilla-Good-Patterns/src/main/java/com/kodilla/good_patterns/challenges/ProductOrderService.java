package com.kodilla.good_patterns.challenges;

public class ProductOrderService {

    public boolean order(User user, Product product) {
       if (user != null && product != null) {
           System.out.println("User " + user.getUserName() + " has ordered " + product.getProduct());
           return true;
       } else {
           System.out.println("Order cannot be processed");
           return false;
       }
    }

}
