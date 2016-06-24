package org.bithus.proxy;

/**
 * Created by michal on 23.06.16.
 */
public class TwitterDemo {

    public static void main(String[] args) {

        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());

        System.out.println(service.getTimeline("bh5k"));
    }

}
