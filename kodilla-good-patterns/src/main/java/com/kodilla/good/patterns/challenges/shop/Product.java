package com.kodilla.good.patterns.challenges.shop;

public class Product {

    private String product;
    private int productStoreNumber;
    private double price;


    public Product(String productName, int productID, double productPrice) {
        this.product = productName;
        this.productStoreNumber = productID;
        this.price = productPrice;
    }

    public String getProductName() {
        return product;
    }

    public int getProductID() {
        return productStoreNumber;
    }

    public double getProductPrice() {
        return price;

    }
}
