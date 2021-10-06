package com.example.car_gen;

public class CombustionEngine extends Engine {
    private String fuelType;

    public CombustionEngine(int power, String fuelType) {
        super(power, "Combustion");
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
