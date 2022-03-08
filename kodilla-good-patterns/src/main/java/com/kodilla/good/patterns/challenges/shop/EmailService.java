package com.kodilla.good.patterns.challenges.shop;

public class EmailService implements  InformationService{

    public void inform(User user) {
        System.out.println("Details of the purchase have been sent to  the following e-mail address: " + user.getEmailAddress());
    }

}
