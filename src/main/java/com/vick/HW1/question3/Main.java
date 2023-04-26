package com.vick.HW1.question3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(2,3,4);
        Triangle triangle2 = new Triangle(3,4,5);
        Triangle triangle3 = new Triangle(6,7,8);

        Square square1 = new Square(3);
        Square square2 = new Square(4);
        Square square3 = new Square(5);

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(4);
        Circle circle3 = new Circle(6);

        ArrayList<Shape> arrayList = new ArrayList<Shape>();
        arrayList.add(triangle1);
        arrayList.add(square1);
        arrayList.add(circle1);
        arrayList.add(triangle2);
        arrayList.add(square2);
        arrayList.add(circle2);
        arrayList.add(triangle3);
        arrayList.add(square3);
        arrayList.add(circle3);

        for (Shape s: arrayList) {
            switch (s.quantityOfCorners) {
                case 3 -> System.out.printf("Triangle: area = %s, perimeter = %s;%n", s.getArea(), s.getPerimeter());
                case 0 -> System.out.printf("Circle: area = %s, perimeter = %s;%n", s.getArea(), s.getPerimeter());
                case 4 -> System.out.printf("Square: area = %s, perimeter = %s;%n", s.getArea(), s.getPerimeter());
            }
        }
    }
}
