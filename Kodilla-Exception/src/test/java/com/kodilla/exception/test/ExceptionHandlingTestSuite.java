package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTestSuite {

    @Test
    void testSecondChallengeExceptionHandler() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When

        //Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.1, 1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3, 1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9, 1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5, 1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.9, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.9, 1)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.9, 1.4)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1.4)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.9, 1.6)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1.6))
        );
    }

}
