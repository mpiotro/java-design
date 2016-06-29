package org.bithus.observer;

/**
 * Created by michal on 29.06.16.
 */
public abstract class Observer {

    protected Subject subject;

    abstract void update();

}
