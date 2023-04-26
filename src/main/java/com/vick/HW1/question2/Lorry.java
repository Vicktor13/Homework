package com.vick.HW1.question2;

/* отказ от наследования и полиморфизма
Класс не наследует класс Car, что в неполной мере раскрывает функционал класса Car(можно перенести все методы, но зачем?)
 не имплементит интерфейсы Moveable и Stopable, хоть и созданы методы этих интерфейсов*/
public class Lorry {
    public void move() {
        System.out.println("Car is moving");
    }

    public void stop() {
        System.out.println("Car is stop");
    }
}
