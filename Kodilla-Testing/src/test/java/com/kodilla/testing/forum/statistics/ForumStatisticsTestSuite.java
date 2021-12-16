package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> generateUsernames(int n) {
        List<String> usernames = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            usernames.add(i + "");
        }
        return usernames;
    }

    @Test
    void testCalculateAdvStatisticsWhenPosts0Users0Comments0() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> usernames = generateUsernames(0);
        when(statisticsMock.userNames()).thenReturn(usernames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getPostsToUsersRatio());
        assertEquals(0, forumStatistics.getCommentsToUsersRatio());
        assertEquals(0, forumStatistics.getCommentsToPostsRatio());
    }

    @Test
    void testCalculateAdvStatisticsWhenPosts0Users100Comments0() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> usernames = generateUsernames(100);
        when(statisticsMock.userNames()).thenReturn(usernames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getPostsToUsersRatio());
        assertEquals(0, forumStatistics.getCommentsToUsersRatio());
        assertEquals(0, forumStatistics.getCommentsToPostsRatio());
    }

    @Test
    void testCalculateAdvStatisticsWhenPosts1000Users100Comments0() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> usernames = generateUsernames(100);
        when(statisticsMock.userNames()).thenReturn(usernames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, forumStatistics.getPostsToUsersRatio());
        assertEquals(0, forumStatistics.getCommentsToUsersRatio());
        assertEquals(0, forumStatistics.getCommentsToPostsRatio());
    }

    @Test
    void testCalculateAdvStatisticsWhenPosts1000Users100Comments100() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> usernames = generateUsernames(100);
        when(statisticsMock.userNames()).thenReturn(usernames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, forumStatistics.getPostsToUsersRatio());
        assertEquals(1, forumStatistics.getCommentsToUsersRatio());
        assertEquals(0.1, forumStatistics.getCommentsToPostsRatio());
    }

    @Test
    void testCalculateAdvStatisticsWhenPosts1000Users100Comments10000() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> usernames = generateUsernames(100);
        when(statisticsMock.userNames()).thenReturn(usernames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, forumStatistics.getPostsToUsersRatio());
        assertEquals(100, forumStatistics.getCommentsToUsersRatio());
        assertEquals(10, forumStatistics.getCommentsToPostsRatio());
    }

}
