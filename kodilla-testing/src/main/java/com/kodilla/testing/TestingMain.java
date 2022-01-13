package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        int result = calculator.add(33,8);
        System.out.println(result);


        int result1 = calculator.subtract(29,6);
        System.out.print(result1);

        System.out.println("\n Program dziala");
    }
}