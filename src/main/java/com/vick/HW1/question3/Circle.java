package com.vick.HW1.question3;

public class Circle extends Shape{
    private float radius;

    public Circle( int radius) {
        super(0);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public float getPerimeter() {
        return (float)(2 * Math.PI *radius);
    }
}
