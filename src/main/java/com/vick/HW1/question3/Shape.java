package com.vick.HW1.question3;

abstract public class Shape {

    public Shape(int quantityOfCorners) {
        this.quantityOfCorners = quantityOfCorners;
    }

    int quantityOfCorners;

    abstract public double getArea();
    abstract public float getPerimeter();
}
