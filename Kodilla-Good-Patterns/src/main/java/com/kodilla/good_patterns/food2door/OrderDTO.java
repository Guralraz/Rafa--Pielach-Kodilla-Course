package com.kodilla.good_patterns.food2door;

public class OrderDTO {

    private String producerName;

    private String productName;

    private int quantity;

    public OrderDTO(String producerName, String productName, int quantity) {
        this.producerName = producerName;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return producerName + " " + productName + " " + quantity;
    }
}
