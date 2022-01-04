package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTestSuite {

    @Test
    void testSecondChallengeExceptionHandler() {
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();

        //When

        //Then
        assertAll(
                () -> assertThrows(Exception.class, () -> exceptionHandling.secondChallengeExceptionHandler(2, 1)),
                () -> assertThrows(Exception.class, () -> exceptionHandling.secondChallengeExceptionHandler(2.1, 1)),
                () -> assertThrows(Exception.class, () -> exceptionHandling.secondChallengeExceptionHandler(3, 1)),
                () -> assertThrows(Exception.class, () -> exceptionHandling.secondChallengeExceptionHandler(0.9, 1)),
                () -> assertThrows(Exception.class, () -> exceptionHandling.secondChallengeExceptionHandler(0.5, 1)),
                () -> assertThrows(Exception.class, () -> exceptionHandling.secondChallengeExceptionHandler(1, 1.5)),
                () -> assertThrows(Exception.class, () -> exceptionHandling.secondChallengeExceptionHandler(1.9, 1.5)),
                () -> assertDoesNotThrow(() -> exceptionHandling.secondChallengeExceptionHandler(1.9, 1)),
                () -> assertDoesNotThrow(() -> exceptionHandling.secondChallengeExceptionHandler(1, 1)),
                () -> assertDoesNotThrow(() -> exceptionHandling.secondChallengeExceptionHandler(1.9, 1.4)),
                () -> assertDoesNotThrow(() -> exceptionHandling.secondChallengeExceptionHandler(1, 1.4)),
                () -> assertDoesNotThrow(() -> exceptionHandling.secondChallengeExceptionHandler(1.9, 1.6)),
                () -> assertDoesNotThrow(() -> exceptionHandling.secondChallengeExceptionHandler(1, 1.6))
        );
    }

}
