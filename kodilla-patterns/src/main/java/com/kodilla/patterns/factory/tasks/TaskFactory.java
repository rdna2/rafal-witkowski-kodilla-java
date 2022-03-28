package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
        public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskType) {
        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask("Shopping task", "Models", 15);
            case PAINTING:
                return new PaintingTask("Painting task", "Black", "Door");
            case DRIVING:
                return new DrivingTask("Driving task", "Poland", "Bike");
            default:
                return null;
        }
    }
}