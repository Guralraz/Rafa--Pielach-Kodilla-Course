package com.kodilla.good_patterns.challenges;

public class Main {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new BookOrderRequestRetriever();
        OrderRequestRetriever orderRequestRetriever1 = new ShoesOrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve("IndianGoogleTechSupport69/420", "Door to perception");
        OrderRequest orderRequest1 = orderRequestRetriever1.retrieve("BigPPJoe", "AirMax Classic");
        OrderProcessor orderProcessor = new OrderProcessor(new EmailSender(), new ProductOrderService(), new OrderRepository());
        orderProcessor.process(orderRequest);
        orderProcessor.process(orderRequest1);
    }

}
