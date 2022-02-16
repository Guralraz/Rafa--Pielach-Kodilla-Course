package com.kodilla.spring.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<String> books = new ArrayList<>();

    public Library(LibraryDBController libraryDBController) {
        this.libraryDBController = libraryDBController;
    }

    public Library() {

    }

    private LibraryDBController libraryDBController;

    public void saveToDB() {
        libraryDBController.saveData();
    }

    public void loadFromDB() {
        libraryDBController.loadData();
    }

}
