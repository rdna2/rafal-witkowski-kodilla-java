package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDate;

public class OrderRepositoryService implements OrderRepository {

    @Override
    public boolean newOrder(User user, Product product, LocalDate orderDate) {
        return true;

    }
}
