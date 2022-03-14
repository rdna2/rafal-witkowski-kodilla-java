package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDate;

public class OrderRepositoryService implements OrderRepository {

    @Override
    public boolean newOrder(User user, Product product, LocalDate orderDate) {
        System.out.println("(OrderRepositoryService printout: )");
        System.out.println("Our valued Customer " + user.getFirstName() + " " + user.getLastName());
        System.out.println( "Your order of: " + product.getProductName() + ", ProductStoreNumber: "
        + product.getProductStoreNumber() +" has been successfully processed!");
        System.out.println( "The value of your purchase is: $" + product.getPrice());
        return true;

    }
}
