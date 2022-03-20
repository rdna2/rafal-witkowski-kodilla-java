package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(6, 4);
        double subResult = calculator.sub(13, 3);
        double mulResult = calculator.mul(2, 5);
        double divResult = calculator.div(20, 2);

        //Then
        assertEquals(10, addResult);
        assertEquals(10, subResult);
        assertEquals(10, mulResult);
        assertEquals(10, divResult);
    }
}