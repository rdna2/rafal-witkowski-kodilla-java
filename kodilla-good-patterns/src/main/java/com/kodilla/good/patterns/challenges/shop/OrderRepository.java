package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDate;

public interface OrderRepository {

    boolean newOrder(User user, Product product, LocalDate orderDate);


}
