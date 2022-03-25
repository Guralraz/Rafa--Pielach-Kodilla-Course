package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
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
    @Autowired
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

    @Test
    void testNamedQueries() {
        //Given
        Task task1 = new Task("Test: Study Hibernate", 3);
        Task task2 = new Task("Test: Practice Named Queries", 6);
        Task task3 = new Task("Test: Study native queries", 7);
        Task task4 = new Task("Test: Make some tests", 13);

        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(5), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        TaskFinancialDetails tfd3 = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd4 = new TaskFinancialDetails(new BigDecimal(15), false);

        task1.setTaskFinancialDetails(tfd1);
        task2.setTaskFinancialDetails(tfd2);
        task3.setTaskFinancialDetails(tfd3);
        task4.setTaskFinancialDetails(tfd4);

        TaskList taskList = new TaskList("ToDo", "ToDo tasks");
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        taskList.getTasks().add(task3);
        taskList.getTasks().add(task4);

        task1.setTaskList(taskList);
        task2.setTaskList(taskList);
        task3.setTaskList(taskList);
        task4.setTaskList(taskList);

        taskListDAO.save(taskList);
        int id = taskList.getId();

        //When
        List<Task> longTasks = taskDAO.retrieveLongTasks();
        List<Task> shortTasks = taskDAO.retrieveShortTasks();
        List<Task> enoughTimeTasks = taskDAO.retrieveTasksWithEnoughTime();
        List<Task> durationLongerThanTasks = taskDAO.retrieveTasksWithDurationLongerThan(6);

        //Then
        try {
            assertEquals(1, longTasks.size());
            assertEquals(3, shortTasks.size());
            assertEquals(3, enoughTimeTasks.size());
            assertEquals(2, durationLongerThanTasks.size());
        } finally {
            //CleanUp
            taskListDAO.deleteById(id);
        }
    }

}
