package com.kodilla.good_patterns.challenges;

public class Main {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new EmailSender(), new ProductOrderService(), new OrderRepository());
        orderProcessor.process(orderRequest);
    }

}
