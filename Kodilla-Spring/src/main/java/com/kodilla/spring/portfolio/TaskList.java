package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {

    private final List<String> tasks;

    public TaskList(List<String> tasks) {
        this.tasks = tasks;
    }

    public void addTask(String name) {
        tasks.add(name);
    }

    public String getTaskIndexNo(int indexNo) {
        return tasks.get(indexNo);
    }
}
