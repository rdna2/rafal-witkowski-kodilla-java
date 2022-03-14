package com.kodilla.good.patterns.challenges.food2Door;

public class OrderInformationService implements InformationService{



    @Override
    public void confirmOrder(FoodProducer producer, Order order) {

        System.out.println("\nOrder placed with: "  + producer +  " for: " + order.getProduct()
                + " in quantity of: " + order.getQuantity() + " has been successfully placed.\n" +"Thank you for your order placed with:");

    }
@Override
    public void unsuccessfulOrder( FoodProducer producer, Order order) {
        System.out.println("\nQUANTITY TOO LOW!!! Order placed with: " + producer + " for: " + order.getProduct()
            + " in quantity of: " + order.getQuantity() + " has been declined.");
            }
}
