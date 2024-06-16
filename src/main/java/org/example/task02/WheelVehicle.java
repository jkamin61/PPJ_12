package org.example.task02;

public class WheelVehicle extends Vehicle {
    private int wheelCount;

    public WheelVehicle( String color, int wheelCount) {
        super(color);
        this.wheelCount = wheelCount;
    }
}
