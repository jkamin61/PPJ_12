package org.example.task01;

public class Main {
    public static void main(String[] args) {
        Rocket rocket = new Rocket("Falcon", 400);
        while (!rocket.rocketLaunched) {
            rocket.tank();
            try {
                rocket.launch();
            } catch (NoFuelException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
