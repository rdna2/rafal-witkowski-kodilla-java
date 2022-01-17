package com.kodilla.testing.shape;

import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("START OF ALL TESTS")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeStartTesting() {
        System.out.println("Starting test.. ");
    }
    @AfterClass
    public static void afterTest() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @After
    public void after(){
        System.out.println("Finished test");
    }

    //@Nested
    //@DisplayName("TEST")
    //class TestShapeCollector {

        @DisplayName("Testing AddFigure to the ShapeCollector ArrayList")

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
        @DisplayName("Testing RemoveFigure from the ShapeCollector ArrayList")

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
        @DisplayName("Testing GetFigureAsN_listedItem from the ShapeCollector ArrayList")

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
    @DisplayName("Testing ShowAllShapes from the ShapeCollector ArrayList")

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

//}