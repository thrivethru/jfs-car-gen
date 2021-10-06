package com.example.car_gen;

public class Honda extends Car {
    private boolean isTurboCharged;

    public Honda(String color, int year, String model, int maxSpeed, Engine engine, int numDoors, boolean isTurboCharged) {
        super(color, year, "Honda", model, maxSpeed, engine, numDoors);
        this.isTurboCharged = isTurboCharged;
    }

    public boolean isTurboCharged() {
        return isTurboCharged;
    }

    public void setTurboCharged(boolean turboCharged) {
        isTurboCharged = turboCharged;
    }
}
