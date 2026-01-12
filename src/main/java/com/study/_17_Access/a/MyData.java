package com.study._17_Access.a;

public class MyData {
    public int publicField;
    int defaultField; // 접근제어자를 생략하면 default
    private int privateField;

    public void publicMethod() {
        System.out.println("public 호출");
    }
    void defaultMethod() {
        System.out.println("default 호출");
    }
    private void privateMethod() {
        System.out.println("private 호출");
    }

    public void inner(int num) {
        if (num < 0) {
            System.out.println("num은 양수여야 합니다");
            return;
        }
        this.privateField = num;
        privateMethod(); // 같은 클래스내부니까 호출가능

    }

}
