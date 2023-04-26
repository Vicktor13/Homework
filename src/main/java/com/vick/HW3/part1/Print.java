package com.vick.HW3.part1;

public class Print {
    private String check = "pong";

    public synchronized void ping(){
        if (check == "ping") {
            try {
                wait();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("ping");
        notify();
        check = "ping";
    }

    public synchronized void pong(){
        if (check == "pong"){
            try {
                wait();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("pong");
        notify();
        check = "pong";
    }
}
