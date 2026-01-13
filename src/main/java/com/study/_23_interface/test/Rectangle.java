package com.study._23_interface.test;

public class Rectangle implements Shape{

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double width;
    double height;

    @Override
    public double getArea() {
        return width * height;
    }
}
