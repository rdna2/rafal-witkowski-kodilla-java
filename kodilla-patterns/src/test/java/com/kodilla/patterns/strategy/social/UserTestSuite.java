package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new YGeneration("Adam Ant");
        User user2 = new ZGeneration("Zed Bed");
        User user3 = new Millenials("2K");

        //When
          String snapchat = user1.sharePost();
          System.out.println("Adam has posted: " + snapchat);
          String facebook = user2.sharePost();
        System.out.println("Zed has posted: " + facebook);
          String twitter = user3.sharePost();
        System.out.println("2K has posted: " + twitter);

        //Then
        Assert.assertEquals("Snapchat", snapchat);
        Assert.assertEquals("Facebook", facebook);
        Assert.assertEquals("Twitter", twitter);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user4 = new YGeneration("Yogi Bear");

        //When
        System.out.println("Yogi has posted: " + user4.sharePost());
        user4.setSharingPreferences(new FacebookPublisher());
        System.out.println("Yogi has posted: " + user4.sharePost());

        //Then
        Assert.assertEquals("Facebook",user4.sharePost());
    }
}