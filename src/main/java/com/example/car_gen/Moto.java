package com.example.car_gen;

public class Moto extends Vehicle {
    private Engine engine;
    private int numOfSeats;

    public Moto (String color, int year, String make, String model, int maxSpeed, Engine engine, int numOfSeats) {
        super(color, year, make, model, maxSpeed, true);
        this.engine = engine;
        this.numOfSeats = numOfSeats;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getEngineType() {
        return engine.getType();
    }

    public int getEnginePower() {
        return engine.getPower();
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }
}
