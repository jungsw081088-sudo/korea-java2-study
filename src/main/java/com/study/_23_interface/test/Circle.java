package com.study._23_interface.test;

public class Circle implements Shape{

    public Circle(double r) {
        this.r = r;
    }

    double r = 5;
    @Override
    public double getArea() {
        return r*r * 3.14;
    }
}
