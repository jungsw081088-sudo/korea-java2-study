package com.study._23_interface.test;

public class Main {
    public static void main(String[] args) {
        double total = 0.0;
        Shape s1 = new Circle(4);
        Shape s2 = new Rectangle(10, 10);
        Shape s3 = new Triangle(2, 4);
        Shape[] shapes = {s1, s2, s3};
        for (Shape s : shapes) {

            total += s.getArea();
        }
        System.out.println(total);
    }
}
