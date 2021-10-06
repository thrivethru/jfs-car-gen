package com.example.car_gen;

public class Car extends Vehicle {
    private int numDoors;
    private Engine engine;

    public Car(String color, int year, String make, String model, int maxSpeed, Engine engine, int numDoors) {
        super(color, year, make, model, maxSpeed, true);
        this.engine = engine;
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
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

    public boolean isElectric() {
        return this.getEngineType().equals("Electric");
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean convertToElectric(int power) {
        if (this.isElectric()) {
            System.out.println("The car is already electric.");
        } else {
            Engine newEngine = new ElectricMotor(power);
            this.setEngine(newEngine);
        }
        return this.isElectric();
    }
}
