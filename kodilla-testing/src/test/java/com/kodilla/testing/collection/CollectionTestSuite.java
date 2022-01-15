package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Starting new test");
    }
    @AfterEach
    public void after(){
        System.out.println("Finished test");
    }
    @BeforeAll
    public static void beforeClass() {
        System.out.println("Starting all tests");
    }
    @AfterAll
    public static void afterClass() {
        System.out.println("All tests finished");
    }

    @DisplayName("When creating a new ArrayList with OddNumbersExterminator class, " +
            "the created ArrayList is tested against empty ArrayList. " +
            "If the test is passed, the created ArrayList is empty."
    )
    @Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList<Integer> emptyList = new ArrayList<>();

        ArrayList <Integer> inputList = new ArrayList<>();

        OddNumbersExterminator run1 = new OddNumbersExterminator();
        ArrayList<Integer> testedList = run1.exterminate(inputList);


        assertEquals(emptyList, testedList);

        System.out.println("Empty List size: " + emptyList.size());
        System.out.println("Tested List size: " + testedList.size());
    }

    @DisplayName("When creating a new ArrayList with OddNumbersExterminator class" +
            "from input ArrayList, only odd numbers should be transferred. "+
            "If the test is passed, only odd numbers are in the inputArrayList")
    @Test
            public void testOddNumbersExterminatorNormalList() {

        //ArrayList<Integer> fullList = new ArrayList<Integer>();

        Random generator = new Random();
        int a = generator.nextInt(10);

        Integer input[] = new Integer [] {0,1,2,4,a};
        ArrayList<Integer> fullList = new ArrayList<Integer> (Arrays.asList(input));

        //fullList.add(0);
        //fullList.add(1);
        //fullList.add(4);
        //fullList.add(8);

        OddNumbersExterminator run2 = new OddNumbersExterminator();
        ArrayList<Integer> oddNumbersList = run2.exterminate(fullList);

        assertEquals(fullList, oddNumbersList);

        System.out.println("Initial List: " + fullList + " Number of elements: " + oddNumbersList.size());
        System.out.println("Final List: " + oddNumbersList + " Number of elements: " + oddNumbersList.size());
    }
}