package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop  implements FoodProducer {


    @Override
    public boolean process(Order order) {

        Map<String, Integer> inventory = new HashMap<>();

        inventory.put("Musli", 40);
        inventory.put("TomatoJuice", 35);
        inventory.put("BananaBread", 45);

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {

            if (order.getProduct().equals(entry.getKey()) &&  order.getQuantity() <= entry.getValue()) {

                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "HealthyShop";
    }
}
