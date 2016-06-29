package org.bithus.state;

/**
 * Created by michal on 29.06.16.
 */
public class FanLowState extends State {

    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Switching fan from low to mid.");
        fan.setState(fan.getFanMedState());
    }

    public String toString() {
        return "Fan is in low.";
    }
}
