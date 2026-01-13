package com.study._23_interface.test;

public class Triangle implements Shape{

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double base, height;

    @Override
    public double getArea() {
        return base * height;
    }
}
