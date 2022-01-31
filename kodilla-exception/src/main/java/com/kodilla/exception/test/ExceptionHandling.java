package com.kodilla.exception.test;


import com.kodilla.exception.test.SecondChallenge;
public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        String result = "No result";
        try {
            result = secondChallenge.probablyIWillThrowException(15, 1.5);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Wrong arguments" +e);
               } finally {
            System.out.println(result);
        }
    }

}
