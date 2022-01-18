package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for Operartions on Shape Collections")
    class ShapeOperationsTests {

        @DisplayName("Testing AddFigure to ShapeCollector ArrayList")

        @Test
        public void testAddFigure() {

            //Given
            ShapeCollector collection = new ShapeCollector();
            Shape shape1 = new Square(3);
            Shape shape2 = new Circle(5);
            Shape shape3 = new Triangle(4, 5);
            //When
            collection.addFigure(shape1);
            collection.addFigure(shape2);
            collection.addFigure(shape3);
            //Then
            assertEquals(3, collection.getCollection().size());
        }
        @DisplayName("Testing RemoveFigure from ShapeCollector ArrayList")

        @Test
        public void testRemoveFigure() {

            //Given
            ShapeCollector collection = new ShapeCollector();
            Shape shape1 = new Square(3);
            Shape shape2 = new Circle(5);
            Shape shape3 = new Triangle(4, 5);
            collection.addFigure(shape1);
            collection.addFigure(shape2);
            collection.addFigure(shape3);
            //When
            collection.removeFigure(shape1);
                       //Then
            assertEquals(2, collection.getCollection().size());
        }
        @DisplayName("Testing GetFigureAsN_listedItem from ShapeCollector ArrayList")

        @Test
        public void testGetFigureAsN_listedItemFromArrayList() {

            //Given
            ShapeCollector collection = new ShapeCollector();
            Shape shape1 = new Square(3);
            Shape shape2 = new Circle(5);
            Shape shape3 = new Triangle(4, 5);
            collection.addFigure(shape1);
            collection.addFigure(shape2);
            collection.addFigure(shape3);
            //When
            Shape result = collection.getFigure(1);
            //Then
            assertEquals(shape2, result);
        }
        @DisplayName("Testing ShowAllShapes from ShapeCollector ArrayList")

        @Test
        public void testShowAllShapes() {

            //Given
            ShapeCollector collection = new ShapeCollector();
            Shape shape1 = new Square(3);
            Shape shape2 = new Circle(5);
            Shape shape3 = new Triangle(4, 5);
            collection.addFigure(shape1);
            collection.addFigure(shape2);
            collection.addFigure(shape3);

            ArrayList<Shape> shapeList = new ArrayList<>();
            shapeList.add(shape1);
            shapeList.add(shape2);
            shapeList.add(shape3);

            //When
            List<Shape> testedList = collection.getCollection();
            //Then
            assertEquals(shapeList.toString(), testedList.toString());
        }
    }

}