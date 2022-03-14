package com.kodilla.good.patterns.challenges.carRental;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository{

    @Override
       public boolean createRental(User user, LocalDateTime carRentFrom, LocalDateTime carRentTo) {
        System.out.println("createRental");
        return true;
    }
}
