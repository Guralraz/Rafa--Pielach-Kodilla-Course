package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void secondChallengeExceptionHandler(double a, double b) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(a, b);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Processing finished");
        }
    }

    public static void main(String[] args) {
        secondChallengeExceptionHandler(2, 1);
    }

}
