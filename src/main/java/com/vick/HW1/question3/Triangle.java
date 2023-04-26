package com.vick.HW1.question3;

public class Triangle extends Shape{

    private float side1;
    private float side2;
    private float side3;

    public Triangle(float side1, float side2, float side3) {
        super(3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double p = (side1 + side2 + side3)/2;
        return (Math.sqrt(p * (p-side1) * (p - side2) * (p - side3)));
    }

    @Override
    public float getPerimeter() {
        return (side1 + side2 + side3);
    }
}
