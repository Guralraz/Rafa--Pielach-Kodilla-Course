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

    //te zmienne do wywalenia
    int postsCount2 = 1000;
    int commentsCount1 = 0;
    int commentsCount2 = 100;
    int commentsCount3 = 10000;

    private List<String> generateUsernames(int n) {
        List<String> usernames = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            usernames.add(i + "");
        }
        return usernames;
    }

    @Test
    void testCalculateAdvStatisticsForPostsToUsersRatio() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
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
    void testCalculateAdvStatisticsForCommentsToUsersRatioWhen0Comments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> userNames2 = generateUsernames(100);
        when(statisticsMock.userNames()).thenReturn(userNames2);
        when(statisticsMock.postsCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount1);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double commentsToUsersRatio = forumStatistics.getCommentsToUsersRatio();

        //Then
        assertEquals(0, commentsToUsersRatio);
    }

    @Test
    void testCalculateAdvStatisticsForCommentsToUsersRatioWhen100Comments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> userNames2 = generateUsernames(100);
        when(statisticsMock.userNames()).thenReturn(userNames2);
        when(statisticsMock.postsCount()).thenReturn(postsCount2);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount2);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double commentsToUsersRatio = forumStatistics.getCommentsToUsersRatio();

        //Then
        assertEquals(1, commentsToUsersRatio);
    }

    @Test
    void testCalculateAdvStatisticsForCommentsToUsersRatioWhen10000Comments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> userNames2 = generateUsernames(100);
        when(statisticsMock.userNames()).thenReturn(userNames2);
        when(statisticsMock.postsCount()).thenReturn(postsCount2);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount3);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double commentsToUsersRatio = forumStatistics.getCommentsToUsersRatio();

        //Then
        assertEquals(100, commentsToUsersRatio);
    }

    @Test
    void testCalculateAdvStatisticsForCommentsToPostsRatioWhen0Comments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> userNames2 = generateUsernames(100);
        when(statisticsMock.userNames()).thenReturn(userNames2);
        when(statisticsMock.postsCount()).thenReturn(postsCount2);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount1);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double commentsToPostsRatio = forumStatistics.getCommentsToPostsRatio();

        //Then
        assertEquals(0, commentsToPostsRatio);
    }

    @Test
    void testCalculateAdvStatisticsForCommentsToPostsRatioWhen100Comments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> userNames2 = generateUsernames(100);
        when(statisticsMock.userNames()).thenReturn(userNames2);
        when(statisticsMock.postsCount()).thenReturn(postsCount2);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount2);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double commentsToPostsRatio = forumStatistics.getCommentsToPostsRatio();

        //Then
        assertEquals(0.1, commentsToPostsRatio);
    }

    @Test
    void testCalculateAdvStatisticsForCommentsToPostsRatioWhen10000Comments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> userNames2 = generateUsernames(100);
        when(statisticsMock.userNames()).thenReturn(userNames2);
        when(statisticsMock.postsCount()).thenReturn(postsCount2);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount3);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double commentsToPostsRatio = forumStatistics.getCommentsToPostsRatio();

        //Then
        assertEquals(10, commentsToPostsRatio);
    }

}
