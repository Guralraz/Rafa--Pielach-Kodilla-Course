package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(11111, "Guralraz", 'M',
                LocalDate.of(1991, 3, 2), 321));
        userList.add(new ForumUser(11112, "AssGreaser", 'F',
                LocalDate.of(1990, 5, 20), 1876));
        userList.add(new ForumUser(11113, "SmolPP", 'M',
                LocalDate.of(2006, 9, 19), 99));
        userList.add(new ForumUser(11114, "BigPP", 'M',
                LocalDate.of(1985, 3, 11), 0));
        userList.add(new ForumUser(11115, "OrdinaryBitch", 'F',
                LocalDate.of(2003, 6, 7), 19018));
        userList.add(new ForumUser(11116, "HugeTTS", 'F',
                LocalDate.of(1989, 11, 1), 3));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }

}
