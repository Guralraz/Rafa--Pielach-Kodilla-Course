package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskDAOTestSuite {

    @Autowired
    private TaskDAO taskDAO;
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
    void testTaskDaoFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        taskDAO.save(task);
        int duration = task.getDuration();

        //When
        List<Task> readTasks = taskDAO.findByDuration(duration);

        //Then
        assertEquals(1, readTasks.size());

        //CleanUp
        //int id = readTasks.get(0).getId();
        //taskDao.deleteById(id);
    }

}
