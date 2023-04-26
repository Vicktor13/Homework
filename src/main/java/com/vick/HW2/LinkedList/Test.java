package com.vick.HW2.LinkedList;

public class Test {


    public static void main(String[] args) {
        QueueTest listTest = new QueueTest();
        String element1 = "first";
        Integer element2 = 13;
        String element3 ="TestElement";
        double element4 = 1243235.1234;
        double element5 = Math.PI;

        listTest.addInHead(element1);
        listTest.addInTall(element2);
        listTest.addInTall(element3);
        listTest.addInHead(element4);
        listTest.addInTall(element5);
        System.out.println(listTest.print());

        System.out.println(listTest.isElementInList(element3));
        System.out.println(listTest.isElementInList(element5));
        System.out.println();
        

        listTest.removeFirst();
        listTest.removeLast();
        listTest.remove(element2);
        System.out.println(listTest.print());
    }
}
