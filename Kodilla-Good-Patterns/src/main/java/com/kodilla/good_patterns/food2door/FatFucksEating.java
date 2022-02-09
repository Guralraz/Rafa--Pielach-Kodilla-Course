package com.kodilla.good_patterns.food2door;

import java.time.LocalDate;

public class FatFucksEating implements Producer {

    private final String producerName = "FatFucksEating";

    private String productName;

    private int quantity;

    private final LocalDate date = LocalDate.now();

    public FatFucksEating(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public OrderDTO process() {
        if (productName != null && quantity > 0) {
            OrderDTO orderDTO = new OrderDTO(producerName, productName, quantity);
            System.out.println(productName + " has been ordered in quantity of " + quantity + "/" + producerName);
            FatFucksEatingRepository.createRepositoryEntry(orderDTO);
            return orderDTO;
        } else {
            System.out.println("Invalid action/order cannot be processed");
            return new OrderDTO(producerName, "no product", 0);
        }
    }

}
