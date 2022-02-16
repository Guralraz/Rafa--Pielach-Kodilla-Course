package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.addTaskToToDoList("laundry");
        board.addTaskToInProgressList("java bootcamp");
        board.addTaskToDoneList("pay taxes");

        //Then
        assertEquals(board.getToDoListTaskNo(0), "laundry");
        assertEquals(board.getInProgressListTaskNo(0), "java bootcamp");
        assertEquals(board.getDoneListTaskNo(0), "pay taxes");
    }

}
