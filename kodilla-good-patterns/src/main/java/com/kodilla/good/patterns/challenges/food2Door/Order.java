package com.kodilla.good.patterns.challenges.food2Door;

public class Order {

    private String product;
    private Integer quantity;

    public Order(String product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

}
