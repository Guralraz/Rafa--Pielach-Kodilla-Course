package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int uniqueID;
    private final String username;
    private final char sex;
    private final LocalDate dateOdBirth;
    private final int postsCount;

    public ForumUser(int uniqueID, String username, char sex, LocalDate dateOdBirth, int postsCount) {
        this.uniqueID = uniqueID;
        this.username = username;
        this.sex = sex;
        this.dateOdBirth = dateOdBirth;
        this.postsCount = postsCount;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOdBirth() {
        return dateOdBirth;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueID=" + uniqueID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOdBirth=" + dateOdBirth +
                ", postsCount=" + postsCount +
                '}';
    }

}
