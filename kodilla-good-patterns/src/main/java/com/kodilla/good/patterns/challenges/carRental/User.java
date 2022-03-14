package com.kodilla.good.patterns.challenges.carRental;

import java.util.Objects;

public class User {

    private String name;
    private String surname;



    public User(String user, String surname) {
        this.name = user;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user1 = (User) o;
        return name.equals(user1.name) && surname.equals(user1.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "User: " + name +" " + surname;
    }
}
