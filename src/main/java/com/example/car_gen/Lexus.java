package com.example.car_gen;

public class Lexus extends Car {
    private boolean hasLeatherSeats;

    public Lexus(String color, int year, String model, int maxSpeed, Engine engine, int numDoors, boolean hasLeatherSeats) {
        super(color, year, "Toyota", model, maxSpeed, engine, numDoors);
        this.hasLeatherSeats = hasLeatherSeats;
    }

    public boolean isHasLeatherSeats() {
        return hasLeatherSeats;
    }

    public void setHasLeatherSeats(boolean hasLeatherSeats) {
        this.hasLeatherSeats = hasLeatherSeats;
    }
}
