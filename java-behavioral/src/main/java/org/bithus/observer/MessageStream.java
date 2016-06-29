package org.bithus.observer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by michal on 29.06.16.
 */
public class MessageStream extends Subject {

    private Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    void setState(String message) {
        messageHistory.add(message);
        this.notifyObservers();
    }

    @Override
    String getState() {
        return messageHistory.getLast();
    }
}
