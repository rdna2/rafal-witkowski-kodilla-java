package com.kodilla.spring.portfolio;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String taskToDo = "task to be done";
        String taskInProgress = "task being done";
        String taskDone = "task already done";
        board.getToDoList().addTask(taskToDo);
        board.getInProgressList().addTask(taskInProgress);
        board.getDoneList().addTask(taskDone);

        //Then
        assertEquals("task to be done", board.getToDoList().getTasks().get(0));
        assertEquals("task being done", board.getInProgressList().getTasks().get(0));
        assertEquals("task already done", board.getDoneList().getTasks().get(0));
    }
}