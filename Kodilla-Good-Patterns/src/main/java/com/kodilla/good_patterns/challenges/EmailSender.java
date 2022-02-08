package com.kodilla.good_patterns.challenges;

public class EmailSender implements InformationService {

    public void inform(User user, Product product) {
        System.out.println("User " + user.getUserName() + " has been notified of " + product.getProduct() + " purchase");
    }

}
