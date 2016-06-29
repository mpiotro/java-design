package org.bithus.state;

/**
 * Created by michal on 29.06.16.
 */
public class StateDemo {

    public static void main(String[] args) {

        Fan fan = new Fan();

        System.out.println(fan.toString());

        fan.pullChain();

        System.out.println(fan.toString());

        fan.pullChain();

        System.out.println(fan.toString());

        fan.pullChain();

        System.out.println(fan.toString());

        fan.pullChain();

        System.out.println(fan.toString());

        fan.pullChain();

        System.out.println(fan.toString());

    }

}
