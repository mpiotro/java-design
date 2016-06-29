package org.bithus.state;

/**
 * Created by michal on 29.06.16.
 */
public class FanOffState extends State {

    private Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to low.");
        fan.setState(fan.getFanLowState());
    }

    public String toString() {
        return "Fan is off.";
    }

}
