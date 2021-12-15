package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private Statistics statistics;
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double postsToUsersRatio;
    private double commentsToUsersRatio;
    private double commentsToPostsRatio;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        int usersCount = statistics.userNames().size();
        int postsCount = statistics.postsCount();
        int commentsCount = statistics.commentsCount();
        double postsToUsersRatio = (double)statistics.postsCount() / statistics.userNames().size();
        double commentsToUsersRatio = (double)statistics.commentsCount() / statistics.userNames().size();
        double commentsToPostsRatio = (double)statistics.commentsCount() / statistics.postsCount();

        this.usersCount = usersCount;
        this.postsCount = postsCount;
        this.commentsCount = commentsCount;
        this.postsToUsersRatio = postsToUsersRatio;
        this.commentsToUsersRatio = commentsToUsersRatio;
        this.commentsToPostsRatio = commentsToPostsRatio;
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
