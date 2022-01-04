package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {

    @Test
    void testReadFile() {
        //Given
        FileReader fileReader = new FileReader();

        //When

        //Then
        assertDoesNotThrow(() -> fileReader.readFile());
    }

    @Test
    void whenFileDoesntExistsReadFileShouldThrowException() {
        //Given
        FileReader fileReader = new FileReader();
        String fileName = "non-existent_names.txt";

        //When

        //Then
        assertThrows(FileReaderException.class, () -> fileReader.readFile1("non-existent_names.txt"));
    }

    @Test
    public void testReadFileWithName() {
        //Given
        FileReader fileReader = new FileReader();
        //When

        //Then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile1("nie_ma_takiego_pliku.txt")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile1(null)),
                () -> assertDoesNotThrow(() -> fileReader.readFile1("names.txt"))
        );
    }

}
