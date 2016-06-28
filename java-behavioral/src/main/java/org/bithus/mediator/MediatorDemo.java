package org.bithus.mediator;

/**
 * Created by michal on 28.06.16.
 */
public class MediatorDemo {

    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        Light kitchenLight = new Light("Kitchen");
        Light bedroomLight = new Light("Bedroom");

        mediator.registerLight(kitchenLight);
        mediator.registerLight(bedroomLight);

        TurnOnAllLightsCommand turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();

        TurnOffAllLightCommand turnOffAllLightCommand = new TurnOffAllLightCommand(mediator);
        turnOffAllLightCommand.execute();

    }

}
