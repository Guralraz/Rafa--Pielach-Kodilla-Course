package com.kodilla.good_patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class Food2Door {

    List<OrderDTO> orders = new ArrayList<>();

    public void order(Producer producer) {
        orders.add(producer.process());
    }

    public void getOrders() {
        System.out.println("Orders in queue:");
        for (OrderDTO order : orders) {
            System.out.println("(" + order.getProductName() + "/"
                    + order.getQuantity() + " item(s)/" + order.getProducerName());
        }
    }

    public void finalizeOrders() {
        for (OrderDTO order : orders) {
            System.out.println("Send order " + order);
        }
        orders.clear();
    }

}
