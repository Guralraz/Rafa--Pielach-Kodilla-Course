package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue {
    private List<Mentor> mentors = new ArrayList<>();
    private List<Task> tasks = new ArrayList<>();

    public TaskQueue() {
        mentors.add(new Mentor("Jan"));
        mentors.add(new Mentor("Ania"));
        //mentors.add(new Mentor("Krzysztof"));
        tasks.add(new Task("task 10"));
        tasks.add(new Task("task 12"));
        tasks.add(new Task("task 13"));
        tasks.add(new Task("task 14"));
        tasks.add(new Task("task 15"));
        tasks.add(new Task("task 16"));
        tasks.add(new Task("task 17"));
        tasks.add(new Task("task 18"));
        tasks.add(new Task("task 19"));
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers();
    }

    public void notifyObservers() {
        mentors.forEach(e -> e.update(this));
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Task findByName(String name) {
        return tasks.stream().filter(e -> name.equals(e.getName())).findFirst().orElse(null);
    }
}
