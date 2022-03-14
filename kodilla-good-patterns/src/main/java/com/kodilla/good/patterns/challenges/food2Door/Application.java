package com.kodilla.good.patterns.challenges.food2Door;

public class Application {

    public static void main(String[] args) {
        FoodProducer extraFoodShop = new ExtraFoodShop();
        Order order001 = new Order("Octopussy", 7);
        FoodOrderService foodOrderService001 = new FoodOrderService(extraFoodShop,order001);
        foodOrderService001.foodOrder();

        FoodProducer glutenFreeShop = new GlutenFreeShop();
        Order order002 = new Order( "Rolls", 4);
        FoodOrderService foodOrderService002 = new FoodOrderService(glutenFreeShop,order002);
        foodOrderService002.foodOrder();

        FoodProducer healthyShop = new HealthyShop();
        Order order003 = new Order( "BananaBread", 60 );
        FoodOrderService foodOrderService003 = new FoodOrderService(healthyShop, order003);
        foodOrderService003.foodOrder();


        FoodProducer newFoodProducer = new NewFoodProducer();
        Order order004 = new Order( "XXX", 2 );
        FoodOrderService foodOrderService004 = new FoodOrderService(newFoodProducer, order004);
        foodOrderService004.foodOrder();

    }
    }



