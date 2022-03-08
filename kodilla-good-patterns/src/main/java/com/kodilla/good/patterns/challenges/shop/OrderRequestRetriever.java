package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Adam", "Adamski", "adam.adamski@wp.pl");
        Product product = new Product("Toothbrush", 401, 100);
        LocalDate orderDate = LocalDate.now();

        return new OrderRequest(user, product, orderDate);
    }
}
