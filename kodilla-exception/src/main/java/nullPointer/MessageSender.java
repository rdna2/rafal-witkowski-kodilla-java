package com.kodilla.exception.nullpointer;

import com.kodilla.exception.nullpointer.User;
import com.kodilla.exception.nullpointer.MessageNotSentException;

public class MessageSender {

    public void sendMessageTo(User user, String message) throws MessageNotSentException {
        if (user != null) {
            System.out.println("Sending message: " + message + " to: " + user.getName());
        } else {
            throw new MessageNotSentException("Object User was null");
        }
    }
}