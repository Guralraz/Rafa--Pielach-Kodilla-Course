package com.kodilla.rps;

import java.util.Scanner;

public class RPS {

    private Scanner scanner = new Scanner(System.in);
    private String name;
    private boolean isNameToBeSet = false;

    public void setName() {
        name = scanner.nextLine();
        System.out.println("Set " + name + " as your username? Type y/n");
        String answer = scanner.nextLine();
        if (answer.equals("y")) {
            isNameToBeSet = true;
            System.out.println("Good luck " + name);
        } else if (answer.equals("n")) {
            this.createUser();
        } else {
            System.out.println("Only y and n are valid answers, try again!");
            this.createUser();
        }
    }

    public User createUser() {
        User user = null;
        System.out.println("Type in your name");
        this.setName();
        if (isNameToBeSet) {
            user = new User(name);
            return user;
        } else {
            this.setName();
        }
        return user;
    }



}
