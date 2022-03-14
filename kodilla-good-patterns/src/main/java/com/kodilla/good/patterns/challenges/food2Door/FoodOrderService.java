package com.kodilla.good.patterns.challenges.food2Door;

public class FoodOrderService {

    FoodProducer producer;
    Order order;

    public FoodOrderService(FoodProducer producer, Order order) {
        this.producer = producer;
        this.order = order;
    }


    public FoodProducer getProducer() {
        return producer;
    }

    public void foodOrder() {
        OrderInformationService confirm = new OrderInformationService();
        if (producer.process(order)) {
            confirm.confirmOrder(getProducer(), new Order (order.getProduct(), order.getQuantity()));
            System.out.println(getProducer());
                    }
        else{
            confirm.unsuccessfulOrder(getProducer(), new Order (order.getProduct(), order.getQuantity()));
        }
    }

}
