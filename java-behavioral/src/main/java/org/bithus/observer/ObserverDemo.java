package org.bithus.observer;

/**
 * Created by michal on 29.06.16.
 */
public class ObserverDemo {

    public static void main(String[] args) {

        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here is a new message");

    }

}
