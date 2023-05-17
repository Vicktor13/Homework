package com.vick.HW2.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayListTest<Object> listTest = new ArrayListTest<>();
        String element1 = "first";
        Integer element2 = 13;
        String element3 ="TestElement";
        double element4 = 1243235.1234;
        double element5 = Math.PI;

        listTest.add(element1);
        listTest.add(element2);
        listTest.add(element3);
        listTest.add(element4);
        listTest.add(element5);
        listTest.add(element2);
        listTest.add(element3);

        System.out.println(listTest.toString());

        listTest.add(element4);
        listTest.add(element5);
        listTest.add(element3);
        listTest.add(element4);
        listTest.add(element5);
        System.out.println(listTest.toString());

        listTest.remove(1);
        listTest.remove(0);
        System.out.println(listTest.toString());
        System.out.println(listTest.getByValue(element3));

        System.out.println(listTest.getByIndex(3));
    }
}
