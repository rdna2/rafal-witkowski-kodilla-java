package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;

public class NewFoodProducer implements FoodProducer {

    public boolean process(Order order) {

        Map<String, Integer> inventory = new HashMap<>();

        inventory.put("XXX", 10);
        inventory.put("YYY", 5);
        inventory.put("ZZZ", 20);

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {

            if (order.getProduct().equals(entry.getKey()) && order.getQuantity() <= entry.getValue()) {

                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "NewFoodProducer";
    }
}

