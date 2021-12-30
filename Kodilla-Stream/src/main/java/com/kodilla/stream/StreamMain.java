package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Text decorators");
        poemBeautifier.beautify("fuck", (textToBeDecorated) -> textToBeDecorated + " you bitch!");
        poemBeautifier.beautify("fuck", (textToBeDecorated) -> textToBeDecorated.toUpperCase(Locale.ROOT));
        poemBeautifier.beautify("fuck", (textToBeDecorated) -> textToBeDecorated.replaceAll("uc", "**"));
        poemBeautifier.beautify("fuck", (textToBeDecorated) -> textToBeDecorated.replaceAll("fuck", "love"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        People.getList().stream()
                .map(s -> s.replaceAll("Khloe Fry", "Chloe Fry"))
                .map(s -> s.toUpperCase())
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        System.out.println(People.longerThanL("FUCKFUCKFUCK", 10));

        BookDirectory bookDirectory = new BookDirectory();

        bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);

        List<Book> theResultListOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elemnts: " + theResultListOfBooks.size());

        theResultListOfBooks.stream()
                .forEach(System.out::println);

        System.out.println();

        Map<String, Book> theResultMapOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(book -> book.getSignature(), book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());

        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println();

        String theResultStringOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "", ""));

        System.out.println(theResultStringOfBooks);

        System.out.println();

        //Tutaj zaczyna się zadanie 7.3

        Forum forum = new Forum();
        Map<Integer, ForumUser> filtratedUsersList = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOdBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPostsCount() > 0)
                .collect(Collectors.toMap(forumUser -> forumUser.getUniqueID(), forumUser -> forumUser));

        filtratedUsersList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }

}
