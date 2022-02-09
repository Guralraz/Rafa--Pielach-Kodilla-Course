package com.kodilla.good_patterns.food2door;

public class UnhealthyFoods implements Producer {

    private final String producerName = "Unhealthy Foods";

    private String productName;

    private int quantity;

    public UnhealthyFoods(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public OrderDTO process() {
        if (productName != null && quantity > 0) {
            System.out.println(productName + " has been ordered in quantity of " + quantity + "/" + producerName);
            return new OrderDTO(producerName, productName, quantity);
        } else {
            System.out.println("Invalid action/order cannot be processed");
            return new OrderDTO(producerName, "no product", 0);
        }
    }

}
