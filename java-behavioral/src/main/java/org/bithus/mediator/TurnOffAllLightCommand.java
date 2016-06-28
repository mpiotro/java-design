package org.bithus.mediator;

/**
 * Created by michal on 28.06.16.
 */
public class TurnOffAllLightCommand implements Command {

    Mediator mediator;

    public TurnOffAllLightCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}
