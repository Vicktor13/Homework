package com.vick.HW1.question2;

/* Использует наследование и полиморфизм не в полной мере
Не имплиментит Stopable, что не было бы проблемой, перенеси метод stop в Moveable*/
class LightWeightCar extends Car implements Moveable {
    @Override
    void open() {
        System.out.println("Car is open");
    }
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
