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

        if (isOrdered) {
            orderRepository.newOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());
            System.out.println( "Our valued Customer " + orderRequest.getUser().getFirstName() + " " + orderRequest.getUser().getLastName());
            System.out.println( "Your order of: " + orderRequest.getProduct().getProductName() + ", Product ID: "
                    + orderRequest.getProduct().getProductID() +" has been successfully processed!");
            System.out.println( "The value of your purchase is: $" + orderRequest.getProduct().getProductPrice());
            informationService.inform(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            System.out.println("We regret to inform you that your order has not been processed!");
            return new OrderDto(orderRequest.getUser(), false);
        }
    }

}
