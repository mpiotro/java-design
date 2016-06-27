package org.bithus.command;

/**
 * Created by michal on 24.06.16.
 */

//invoker
public class Switch {

    public void sotoreAndExecute(Command command) {
        command.execute();
    }

}
