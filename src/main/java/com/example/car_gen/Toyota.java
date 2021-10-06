package com.example.car_gen;

public class Toyota extends Car {
    private boolean greatGasMileage;

    public Toyota(String color, int year, String model, int maxSpeed, Engine engine, int numDoors, boolean greatGasMileage) {
                super(color, year, "Toyota", model, maxSpeed, engine, numDoors);
        this.greatGasMileage = greatGasMileage;
    }

    public boolean isGreatGasMileage() {
        return greatGasMileage;
    }

    public void setGreatGasMileage(boolean greatGasMileage) {
        this.greatGasMileage = greatGasMileage;
    }
}
