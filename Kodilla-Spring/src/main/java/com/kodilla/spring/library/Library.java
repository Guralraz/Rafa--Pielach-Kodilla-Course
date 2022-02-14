package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Library {

    private final List<String> books = new ArrayList<>();

    @Autowired
    private LibraryDBController libraryDBController;

    public void saveToDB() {
        libraryDBController.saveData();
    }

    public void loadFromDB() {
        libraryDBController.loadData();
    }

}
