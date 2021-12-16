package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

import static java.lang.Character.toUpperCase;

public class StreamMain {

    public static void main(String[] args) {

        System.out.println("Welcome to module 7 - Stream");

        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with mabdas");
        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Text decorators");
        poemBeautifier.beautify("fuck", (textToBeDecorated) -> textToBeDecorated + " you bitch!");
        poemBeautifier.beautify("fuck", (textToBeDecorated) -> textToBeDecorated.toUpperCase(Locale.ROOT));
        poemBeautifier.beautify("fuck", (textToBeDecorated) -> textToBeDecorated.replaceAll("uc", "**"));
        poemBeautifier.beautify("fuck", (textToBeDecorated) -> textToBeDecorated.replaceAll("fuck", "love"));
    }

}
