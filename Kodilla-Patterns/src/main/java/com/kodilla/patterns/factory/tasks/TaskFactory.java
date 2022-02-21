package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "ShoppingTask";
    public static final String PAINTING = "PaintingTask";
    public static final String DRIVING = "DrivingTask";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING: return new ShoppingTask("Shopping", "ground beef", 2.0);
            case PAINTING: return new PaintingTask("Painting", "yellow", "walls");
            case DRIVING: return new DrivingTask("Driving", "Frankfurt", "Mercedes S65 AMG");
            default: return null;
        }

    }

}
