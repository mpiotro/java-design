package org.bithus.state;

/**
 * Created by michal on 29.06.16.
 */
public class FanHighState extends State {

    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Truning fan off from high.");
        fan.setState(fan.getFanOffState());
    }

    public String toString() {
        return "Fan is high.";
    }
}
