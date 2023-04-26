package com.vick.HW3.part2;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    counter.increment();
                }
            }).start();
            Thread.sleep(100);
        }
        System.out.println(counter.getValue());
    }
}
