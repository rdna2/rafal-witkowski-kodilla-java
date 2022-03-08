package com.kodilla.good.patterns.challenges.shop;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new EmailService(), new ProductOrderService(), new OrderRepositoryService());
        orderProcessor.process(orderRequest);
    }

}
