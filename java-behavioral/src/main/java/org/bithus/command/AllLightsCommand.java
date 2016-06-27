package org.bithus.command;

import java.util.List;

/**
 * Created by michal on 27.06.16.
 */
public class AllLightsCommand implements Command {

    private List<Light> lights;

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for (Light light : lights) {
            if (light.isOn()) {
                light.toggle();
            }
        }
    }
}
