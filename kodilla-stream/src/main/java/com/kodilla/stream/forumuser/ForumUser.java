package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char gender;
    private final LocalDate dob;
    private final int postsQty;

    public ForumUser(final int userId, final String userName, final char gender, final int year, final int month, final int day, final int postsQty) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.dob = LocalDate.of(year,month,day);
        this.postsQty = postsQty;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDob() {
        return dob ;
    }

    public int getPostsQty() {
        return postsQty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userId == forumUser.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", dob=" + dob +
                ", postsQty=" + postsQty +
                '}';
    }
}
