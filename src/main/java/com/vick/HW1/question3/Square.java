package com.vick.HW1.question3;

public class Square extends Shape{
    private float side;
    public Square(float side) {
        super(4);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public float getPerimeter() {
        return (4 * side);
    }
}
