package com.kodilla.good.patterns.challenges.shop;

public class EmailService implements  InformationService{

    @Override
    public void inform(User user) {
        System.out.println("(EmailService printout: )");
        System.out.println("Details of the purchase have been sent to  the following e-mail address: " + user.getEmailAddress());
    }
    @Override
    public void unsuccessfulOrder(User user) {
        System.out.println("(EmailService printout: )");
        System.out.println("We regret to inform you that your order has not been processed! Due to unavailability of the item."
                + "\n The information has been sent to the following e-mail address: " + user.getEmailAddress());
    }
}
