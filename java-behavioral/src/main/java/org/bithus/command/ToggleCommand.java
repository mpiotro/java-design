package org.bithus.command;

/**
 * Created by michal on 27.06.16.
 */
public class ToggleCommand implements Command {

    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.toggle();
    }

}
