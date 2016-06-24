package org.bithus.proxy;

/**
 * Created by michal on 23.06.16.
 */
public class TwitterServiceStub implements TwitterService {


    @Override
    public String getTimeline(String screenName) {
        return "My neato timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
