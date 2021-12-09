package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("error!");
        }

        Calculator calculator = new Calculator();

        int additionResult = calculator.addAToB(5, 5);
        int subtractionResult = calculator.subtractAFromB(5,5);

        if (additionResult == 10) {
            System.out.println("addAToB method is working");
        } else {
            System.out.println("addAToB method is not working");
        }

        if (subtractionResult == 0) {
            System.out.println("subtractAFromB method is working");
        } else {
            System.out.println("subtractAFromB method is not working");
        }

    }

}
