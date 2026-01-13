package com.study._23_interface;

// 기능만 명세했던 인터페이스를 각 클래스에 장착해준다
// implements를 사용

// 다중이식이 가능
public class Dog implements Animal, Swimmable {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("히히 신난다");
    }

    @Override
    public void swim() {
        System.out.println("강쥐가 어푸어푸");
    }
}
