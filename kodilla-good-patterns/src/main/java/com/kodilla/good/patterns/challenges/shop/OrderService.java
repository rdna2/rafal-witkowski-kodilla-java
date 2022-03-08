package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDate;

public interface OrderService {

    boolean order(User user, Product product, LocalDate orderDate);
}
