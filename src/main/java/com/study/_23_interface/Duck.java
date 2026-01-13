package com.study._23_interface;

public class Duck implements Animal, Swimmable, Flyable{

    @Override
    public void sound() {
        System.out.println("꽥꽥");
    }

    @Override
    public void move() {
        System.out.println("오리 뒤뚱뒤뚱");
    }

    @Override
    public void fly() {
        System.out.println("오리 날다");
    }

    @Override
    public void swim() {
        System.out.println("오리 수영한다.");
    }
}
