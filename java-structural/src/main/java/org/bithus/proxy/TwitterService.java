package org.bithus.proxy;

/**
 * Created by michal on 23.06.16.
 */
public interface TwitterService {

    public String getTimeline(String screenName);
    public void postToTimeline(String screenName, String message);

}
