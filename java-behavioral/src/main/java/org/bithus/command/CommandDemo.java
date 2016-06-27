package org.bithus.command;

/**
 * Created by michal on 24.06.16.
 */
public class CommandDemo {

    public static void main(String[] args) {

        Light light = new Light();
        Switch lightSwitch = new Switch();

        Command onCommand = new OnCommand(light);

        lightSwitch.storeAndExecute(onCommand);

    }

}
