package com.kodilla.spring.portfolio;

public final class Board {

    private final TaskList toDoList;

    private final TaskList inProgressList;

    private final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addTaskToToDoList(String name) {
        toDoList.addTask(name);
    }

    public void addTaskToInProgressList(String name) {
        inProgressList.addTask(name);
    }

    public void addTaskToDoneList(String name) {
        doneList.addTask(name);
    }

    public String getToDoListTaskNo(int indexNo) {
        return toDoList.getTaskIndexNo(indexNo);
    }

    public String getInProgressListTaskNo(int indexNo) {
        return inProgressList.getTaskIndexNo(indexNo);
    }

    public String getDoneListTaskNo(int indexNo) {
        return doneList.getTaskIndexNo(indexNo);
    }

}
