package com.kodilla.good.patterns.challenges.shop;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());

        if (isOrdered && orderRequest.getProduct().getAvailability()>0) {
           informationService.inform(orderRequest.getUser());
           orderRepository.newOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());

            return new OrderDto(orderRequest.getUser(), true);
        } else {
           informationService.unsuccessfulOrder(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), false);
        }
    }

}
