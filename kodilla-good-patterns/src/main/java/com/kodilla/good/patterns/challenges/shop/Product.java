package com.kodilla.good.patterns.challenges.shop;

public class Product {

    private String productName;
    private int productStoreNumber;
    private double price;
    private int availability;


    public Product(String productName, int productStoreNumber, double price, int availability) {
        this.productName = productName;
        this.productStoreNumber = productStoreNumber;
        this.price = price;
        this.availability = availability;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductStoreNumber() {return productStoreNumber; }

    public double getPrice() {  return price; }

    public int getAvailability() { return availability;}

}
