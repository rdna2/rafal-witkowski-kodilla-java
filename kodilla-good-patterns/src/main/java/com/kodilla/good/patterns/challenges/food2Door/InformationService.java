package com.kodilla.good.patterns.challenges.food2Door;

public interface InformationService {

    public void confirmOrder(FoodProducer producer, Order order);
    public void unsuccessfulOrder(FoodProducer producer, Order order);

}
