package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

class TaskQueueTestSuite {

    @Test
    public void testUpdate() {
        // Given
        // When
        TaskQueue taskQueue = new TaskQueue();
        taskQueue.addTask(new Task("task 1"));
        taskQueue.addTask(new Task("task 2"));
        taskQueue.addTask(new Task("task 3"));
        taskQueue.addTask(new Task("task 4"));
        taskQueue.addTask(new Task("task 5"));
        taskQueue.addTask(new Task("task 6"));
        taskQueue.addTask(new Task("task 7"));
        taskQueue.addTask(new Task("task 8"));
        taskQueue.addTask(new Task("task 9"));


        // Then
        assertNull(taskQueue.findByName("task 1"));
        assertNull(taskQueue.findByName("task 2"));
        assertNull(taskQueue.findByName("task 3"));
        assertNull(taskQueue.findByName("task 4"));
        assertNull(taskQueue.findByName("task 5"));
        assertNull(taskQueue.findByName("task 6"));
        assertNull(taskQueue.findByName("task 7"));
        assertNull(taskQueue.findByName("task 8"));
        assertNull(taskQueue.findByName("task 9"));
    }

}
