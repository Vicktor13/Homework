package com.vick.HW3.part1;

public class Main {

    public static void main(String[] args) {
        Print print = new Print();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                print.ping();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10 ; i++) {
                print.pong();
            }
        }).start();
    }
}
