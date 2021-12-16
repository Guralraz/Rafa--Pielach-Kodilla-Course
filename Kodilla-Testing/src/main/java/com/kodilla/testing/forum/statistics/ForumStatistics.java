package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double postsToUsersRatio;
    private double commentsToUsersRatio;
    private double commentsToPostsRatio;

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersCount = statistics.userNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        if (statistics.userNames().size() == 0) {
            this.postsToUsersRatio = 0;
        } else {
            this.postsToUsersRatio = (double) statistics.postsCount() / statistics.userNames().size();
        }
        if (statistics.userNames().size() == 0) {
            this.commentsToUsersRatio = 0;
        } else {
            this.commentsToUsersRatio = (double)statistics.commentsCount() / statistics.userNames().size();
        }
        if (statistics.postsCount() == 0) {
            this.commentsToPostsRatio = 0;
        } else {
            this.commentsToPostsRatio = (double)statistics.commentsCount() / statistics.postsCount();
        }
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getPostsToUsersRatio() {
        return postsToUsersRatio;
    }

    public double getCommentsToUsersRatio() {
        return commentsToUsersRatio;
    }

    public double getCommentsToPostsRatio() {
        return commentsToPostsRatio;
    }

}
