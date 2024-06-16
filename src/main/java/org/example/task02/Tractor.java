package org.example.task02;

public class Tractor extends WheelVehicle {
    double weightPressure;

    public Tractor(String color, int wheelCount, double weightPressure) {
        super(color, wheelCount);
        this.weightPressure = weightPressure;
    }

    public void startDriving() {
        if (weightPressure > 11) {
            throw new RuntimeException("Cannot start driving, weight pressure is too high");
        } else {
            System.out.println("Tractor is driving");
        }
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "weightPressure=" + weightPressure +
                ", color='" + color + '\'' +
                '}';
    }
}
