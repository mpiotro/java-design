package org.bithus.command;

/**
 * Created by michal on 24.06.16.
 */
public class OnCommand implements Command {

    public OnCommand(Light light) {
        light.on();
    }

    public void execute() {

    }
}
