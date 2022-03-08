package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.dao.TaskListDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskDAOTestSuite {

    @Autowired
    private TaskDAO taskDAO;
    private TaskListDAO taskListDAO;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    void testTaskDAOSave() {
        //Given
        Task task = new Task(DESCRIPTION, 7);

        //When
        taskDAO.save(task);

        //Then
        int id = task.getId();
        Optional<Task> readTask = taskDAO.findById(id);
        assertTrue(readTask.isPresent());

        //CleanUp
        taskDAO.deleteById(id);
    }

    @Test
    void testTaskDAOFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        taskDAO.save(task);
        int duration = task.getDuration();

        //When
        List<Task> readTasks = taskDAO.findByDuration(duration);

        //Then
        assertEquals(1, readTasks.size());

        //CleanUp
        int id = readTasks.get(0).getId();
        taskDAO.deleteById(id);
    }

    @Test
    void testTaskDAOSaveWithFinancialDetails() {
        //Given
        Task task = new Task(DESCRIPTION, 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));

        //When
        taskDAO.save(task);
        int id = task.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        taskDAO.deleteById(id);
    }

}
