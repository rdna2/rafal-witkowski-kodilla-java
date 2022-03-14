package com.kodilla.good.patterns.challenges.carRental;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Confirmation has been sent to: " + user.getName());
    }
}
