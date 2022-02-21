package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    private static TaskFactory factory;

    @BeforeAll
    static void createTaskFactory() {
        factory = new TaskFactory();
    }

    @Test
    void testFactoryShopping() {
        //Given

        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPING);

        //Then
        assert shopping != null;
        assertEquals("Shopping", shopping.getTaskName());
        assertFalse(shopping.isTaskExecuted());
        shopping.executeTask();
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given

        //When
        Task painting = factory.createTask(TaskFactory.PAINTING);

        //Then
        assert painting != null;
        assertEquals("Painting", painting.getTaskName());
        assertFalse(painting.isTaskExecuted());
        painting.executeTask();
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDriving() {
        //Given

        //When
        Task driving = factory.createTask(TaskFactory.DRIVING);

        //Then
        assert driving != null;
        assertEquals("Driving", driving.getTaskName());
        assertFalse(driving.isTaskExecuted());
        driving.executeTask();
        assertTrue(driving.isTaskExecuted());
    }

}
