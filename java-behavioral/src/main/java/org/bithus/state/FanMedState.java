package org.bithus.state;

/**
 * Created by michal on 29.06.16.
 */
public class FanMedState extends State {

    private Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Switching from mid to high.");
        fan.setState(fan.getFanHighState());
    }

    public String toString() {
        return "Fan is in mid.";
    }
}
