package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {

    private final List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String name) {
        tasks.add(name);
    }

    public String getTaskIndexNo(int indexNo) {
        return tasks.get(indexNo);
    }
}
