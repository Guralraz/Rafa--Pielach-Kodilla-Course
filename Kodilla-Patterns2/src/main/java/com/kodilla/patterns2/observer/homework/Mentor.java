package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private String name;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        if (taskQueue.getTasks().size() != 0) {
            System.out.println("Checking task: " + (taskQueue.getTasks().get(taskQueue.getTasks().size() - 1).getName()) + " by " + name);
            taskQueue.getTasks().remove(taskQueue.getTasks().size() - 1);
        } else
            System.out.println("There are " + taskQueue.getTasks().size() + " to be checked " + name);
    }
}
