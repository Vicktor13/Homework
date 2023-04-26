package com.vick.HW3.part2;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Counter {
    private Lock lock;
    private int value;

    public Counter() {
        lock = new ReentrantLock();
        value = 0;

    }

    public void increment() {
        try {
            lock.lock();
            this.value++;
        } finally {
            lock.unlock();
        }
    }

    public int getValue(){
        try {
            lock.lock();
            return this.value;
        } finally {
            lock.unlock();
        }
    }

}
