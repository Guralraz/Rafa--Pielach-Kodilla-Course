package com.kodilla.stream.person;

import java.util.ArrayList;
import java.util.List;

public final class People {

    public static List<String> getList() {
        final List<String> theList = new ArrayList<>();

        theList.add("John Smith");
        theList.add("Dorothy Newman");
        theList.add("John Wolkowitz");
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("Matilda Davies");
        theList.add("Declan Booth");
        theList.add("Corinne Foster");
        theList.add("Khloe Fry");
        theList.add("Martin Valenzuela");

        return new ArrayList<>(theList);
    }

    public static boolean longerThanL(String s, int l) {
        if (s.length() > l) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean longerThan11(String s) {
        boolean isLonger = false;
        if (s.length() > 11) {
            return isLonger = true;
        } else {
            return isLonger;
        }
    }
}
