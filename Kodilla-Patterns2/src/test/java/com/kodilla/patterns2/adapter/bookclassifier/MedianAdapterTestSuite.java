package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        Book book1 = new Book("a", "a", 1991, "hugePP");
        Book book2 = new Book("b", "b", 9119, "smolPP");
        Book book3 = new Book("c", "c", 1919, "medianPP");
        Book book4 = new Book("d", "d", 9191, "averagePP");
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);

        //When
        int medianPublicationYear = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(9119, medianPublicationYear);
    }

}
