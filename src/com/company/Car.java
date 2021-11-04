package com.company;

public class Car {
    Engine engine;
    Car() {}

    Car(Engine engine) {
        this.engine = engine;
    }

    void startEngine() {
        engine.start();
    }
}
