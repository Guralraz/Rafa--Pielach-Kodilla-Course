package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDAOTestSuite {

    @Autowired
    private TaskListDAO taskListDAO;
    private static final String LISTNAME = "Spring and Hibernate";
    private static final String DESCRIPTION = "Module 17";

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDAO.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskListDAO.findByListName(listName);

        //Then
        assertEquals(1, readTaskList.size());

        //CleanUp
        int id = readTaskList.get(0).getId();
        taskListDAO.deleteById(id);
    }

}
