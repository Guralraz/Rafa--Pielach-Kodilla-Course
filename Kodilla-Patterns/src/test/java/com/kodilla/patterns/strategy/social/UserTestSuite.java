package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Charles White");
        User user2 = new GenerationY("Imane Anys");
        User user3 = new GenerationZ("Thomas Simmons");

        //When
        String charliePosts = user1.sharePost();
        System.out.println("Charlie is " + charliePosts);
        String imanePosts = user2.sharePost();
        System.out.println("Imane is " + imanePosts);
        String tommyPosts = user3.sharePost();
        System.out.println("Tommy is" + tommyPosts);

        //Then
        assertEquals("posting to Twitter", charliePosts);
        assertEquals("posting to Facebook", imanePosts);
        assertEquals("posting to Snapchat", tommyPosts);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("Charles White");

        //When
        String charliePosts = user1.sharePost();
        System.out.println("Charlie is " + charliePosts);
        user1.setSocialPublisher(new FacebookPublisher());
        charliePosts = user1.sharePost();
        System.out.println("Charlie is " + charliePosts);

        //Then
        assertEquals("posting to Facebook", charliePosts);
    }
}
