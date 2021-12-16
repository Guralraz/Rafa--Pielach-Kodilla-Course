package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String textToBeDecorated, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(textToBeDecorated);
        System.out.println(result);
    }

}
