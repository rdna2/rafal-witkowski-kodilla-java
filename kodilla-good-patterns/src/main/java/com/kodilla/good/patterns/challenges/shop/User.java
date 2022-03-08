package com.kodilla.good.patterns.challenges.shop;

public class User {

    private String name;
    private String surename;
    private String email;

    public User(String firstName, String lastName, String emailAddress) {
        this.name = firstName;
        this.surename = lastName;
        this.email = emailAddress;
    }

    public String getFirstName() {
        return name;
    }

    public String getLastName() {
        return surename;
    }

    public String getEmailAddress() {
        return email;
    }

}
