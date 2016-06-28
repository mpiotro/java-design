package org.bithus.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michal on 28.06.16.
 */
public class Mediator {

    private List<Light> lights = new ArrayList<>();

    public void registerLight(Light light) {
        lights.add(light);
    }

    public void turnOnAllLights() {
        for (Light light : lights) {
            if(!light.isOn()) {
                light.toggle();
            }
        }
    }

    public void turnOffAllLights() {
        for (Light light : lights) {
            if(light.isOn()) {
                light.toggle();
            }
        }
    }

}
