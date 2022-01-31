//package com.kodilla.exception.nullpointer;
//
//import com.kodilla.exception.nullpointer.User;
//import com.kodilla.exception.nullpointer.MessageSender;
//import com.kodilla.exception.nullpointer.MessageNotSentException;
//
//import java.util.Optional;
//
//
//public class OptionalExample {
//    public static void main(String[] args) {
//        User user = new User("user1", 30, 100, "Test");
//
//        Optional<User> optionalUser = Optional.ofNullable(user);
//
//        String username =
//                optionalUser.orElse(new User("", 0, 0, "")).getUsername();
//
//        System.out.println(username);
//    }
//}