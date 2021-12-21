package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    @DisplayName("Add/Remove method tests")

    @Nested
    class AddRemoveTests {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();

            //When
            shapeCollector.addFigure(circle);

            //Then
            assertEquals(1, shapeCollector.showFigures().size());
        }

        @Test
        void testRemoveNonExistentFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle();

            //When
            boolean result = shapeCollector.removeFigure(triangle);

            //Then
            assertFalse(result);
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square();
            shapeCollector.addFigure(square);

            //When
            boolean result = shapeCollector.removeFigure(square);

            //Then
            assertTrue(result);
            assertEquals(0, shapeCollector.showFigures().size());
        }

    }

    @DisplayName("GetFigure/ShowFigures method tests")

    @Nested
    class GetFigureShowFiguresTests {

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            shapeCollector.addFigure(circle);

            //When
            Shape retrievedShape = shapeCollector.getFigure(0);

            //Then
            assertEquals(circle, retrievedShape);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            Triangle triangle = new Triangle();
            Square square = new Square();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(square);

            //When
            List<Shape> testShapes = new ArrayList<>();
            testShapes.add(circle);
            testShapes.add(triangle);
            testShapes.add(square);

            //Then
            assertEquals(testShapes, shapeCollector.showFigures());
        }

    }

}
