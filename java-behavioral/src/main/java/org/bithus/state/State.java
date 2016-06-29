package org.bithus.state;

/**
 * Created by michal on 29.06.16.
 */
public abstract class State {

    public void handleRequest() {
        System.out.println("Shouldn't be able to get here.");
    }

}
