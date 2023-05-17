package com.vick.HW3.part1;

public class Print {

    private String check;

    public Print(String check) {
        this.check = check;
    }

    public synchronized void printWord(String word) {
        if (check == word) {
            try {
                wait();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println(word);
        notify();
        check = word;
    }
}
