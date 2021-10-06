package com.example.car_gen;

public class Main {
    public void main(String[] args) {
        Engine v4 = new CombustionEngine(150000, "Gas");
        Engine v6 = new CombustionEngine(250000, "Gas");
        Engine v8 = new CombustionEngine(300000, "Gas");
        Car civic = new Honda("blue", 2009, "Civic", 93, v4, 4,false);
        Car rx350 = new Lexus("silver", 2019, "RX350", 120, v6, 4,true);
        Car supra = new Toyota("red", 2015, "Supra", 142, v8, 2, false);

        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());
    }
}
