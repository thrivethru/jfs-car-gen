package com.example.car_gen;

public class Vehicle {
    private String color;
    private int year;
    private String make;
    private String model;
    private int speed;
    private int maxSpeed;
    private boolean isSelfPropelled;

    public Vehicle(String color, int year, String make, String model, int maxSpeed, boolean isSelfPropelled) {
        this.color = color;
        this.year = year;
        this.make = make;
        this.model = model;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
        this.isSelfPropelled = isSelfPropelled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isSelfPropelled() {
        return isSelfPropelled;
    }

    public void setSelfPropelled(boolean selfPropelled) {
        isSelfPropelled = selfPropelled;
    }

    public int accelerateSpeed() {
        int newSpeed = speed + 5;
        if (newSpeed > maxSpeed) {
            this.setSpeed(maxSpeed);
        } else {
            this.setSpeed(newSpeed);
        }
        return this.getSpeed();
    }

    public int decelerateSpeed() {
        int newSpeed = speed - 5;
        if (newSpeed < 0) {
            this.setSpeed(0);
        } else {
            this.setSpeed(newSpeed);
        }
        return this.getSpeed();
    }
}