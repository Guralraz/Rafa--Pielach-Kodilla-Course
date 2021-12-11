package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

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
    public static void before() {
        System.out.println("Collection Test Case running");
    }

    @AfterEach
    public static void after() {
        System.out.println("Collection Test Case complete");
    }

    @DisplayName("When numbers is empty, then evenNumbers should be empty")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminatorTest1 = new OddNumbersExterminator(numbers);
        oddNumbersExterminatorTest1.exterminateOdd(numbers);
    }

}
