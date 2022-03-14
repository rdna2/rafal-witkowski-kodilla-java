package com.kodilla.good.patterns.challenges.carRental;

import java.time.LocalDateTime;

public interface RentalService {


   boolean rent(User user, LocalDateTime carRentFrom, LocalDateTime carRentTo);
}
