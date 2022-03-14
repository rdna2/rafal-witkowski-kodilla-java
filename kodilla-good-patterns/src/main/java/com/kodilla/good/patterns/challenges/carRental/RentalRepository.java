package com.kodilla.good.patterns.challenges.carRental;

import java.time.LocalDateTime;

public interface RentalRepository {

    boolean createRental(User user, LocalDateTime carRentFrom, LocalDateTime carRentTo);
}
