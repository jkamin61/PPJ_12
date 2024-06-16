package org.example.task01;

import java.util.Random;

public class Rocket {
    String name;
    int fuelsWeight;
    boolean rocketLaunched = false;

    public Rocket(String name, int fuelsWeight) {
        this.name = name;
        this.fuelsWeight = fuelsWeight;
    }

    public void tank() {
        Random random = new Random();
        int randomFuel = random.nextInt(100);
        this.fuelsWeight += randomFuel;
    }

    public void launch() throws NoFuelException {
        System.out.println("Checking fuel level...");
        if (fuelsWeight < 1000) {
            throw new NoFuelException("Not enough fuel. Fuel level = " + fuelsWeight);
        } else {
            rocketLaunched = true;
            System.out.println("Rocket " + name + " launched!");
        }
    }

}
