package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        //Given
        Logger.INSTANCE.log("first log");

        //When
        String lastLog = Logger.INSTANCE.getLastLog();

        //Then
        assertEquals(lastLog, "first log");
    }

}
