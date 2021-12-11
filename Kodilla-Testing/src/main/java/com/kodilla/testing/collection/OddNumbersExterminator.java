package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    List<Integer> numbers = new ArrayList<>();

    public OddNumbersExterminator(List<Integer> list) {
        this.numbers = numbers;
    }

    public List<Integer> exterminateOdd(ArrayList<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

}
