package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDate;

public class ProductOrderService implements OrderService{

    @Override
    public boolean order(User user, Product product, LocalDate orderDate) {

      System.out.println("(ProductOrderServices printout:)");
      System.out.println("Order details: " + user.getFirstName() + " " + user.getLastName() +  " has placed an order for: "
               + product.getProductName() + ", ItemStoreNumber: " + product.getProductStoreNumber() + " at the price of: $" +
              product.getPrice()+ " on: " + LocalDate.now());

    return true;
    }

}
