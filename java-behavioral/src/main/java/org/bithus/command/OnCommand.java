package org.bithus.command;

/**
 * Created by michal on 24.06.16.
 */

//concrete command
public class OnCommand implements Command {

    private Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
