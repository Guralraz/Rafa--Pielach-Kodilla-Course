package com.kodilla.good_patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;

    private ProductOrderService productOrderService;

    private ProductOrderRepository productOrderRepository;

    public OrderProcessor(InformationService informationService, ProductOrderService productOrderService, ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public OrderDTO process(OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.order(orderRequest.getUser(), orderRequest.getProduct());
        if (isOrdered) {
            informationService.inform(orderRequest.getUser(), orderRequest.getProduct());
            productOrderRepository.createOrderEntry(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}
