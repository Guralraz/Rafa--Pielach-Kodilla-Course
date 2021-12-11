package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Collection Test Suite running");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Collection Test Suite complete");
    }

    @BeforeEach
    public void before() {
        System.out.println("Collection Test Case running");
    }

    @AfterEach
    public void after() {
        System.out.println("Collection Test Case complete");
    }

    @DisplayName("When numbers is empty, then evenNumbers should be empty")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminatorTest1 = new OddNumbersExterminator(numbers);
        int expectedEvenNumbers = 0;

        //When
        int evenNumbers = oddNumbersExterminatorTest1.exterminateOdd(numbers).size();

        //Then
        Assertions.assertEquals(expectedEvenNumbers, evenNumbers);
    }

    @DisplayName("When numbers has 3 even numbers, then evenNumbers should have 3 elements")

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        OddNumbersExterminator oddNumbersExterminatorTest2 = new OddNumbersExterminator(numbers);
        int expectedEvenNumbers = 3;

        //When
        int evenNumbers = oddNumbersExterminatorTest2.exterminateOdd(numbers).size();

        //Then
        Assertions.assertEquals(expectedEvenNumbers, evenNumbers);
    }

}
