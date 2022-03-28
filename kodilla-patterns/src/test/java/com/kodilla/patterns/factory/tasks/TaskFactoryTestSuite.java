package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals("Shopping task", shopping.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.createTask(TaskFactory.PAINTING);
        //Then
        Assert.assertFalse(painting.isTaskExecuted());
        Assert.assertEquals("Painting task", painting.getTaskName());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.createTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("Driving task", driving.getTaskName());
    }
}
