package com.study._21_Inheritance.sample;

public class Child extends Parent {
    int x = 20;

    void test() {
        // x는 Child객체의 x를 말한다.
        System.out.println(x);
        // 부모의 x를 말한다.
        System.out.println(super.x);

        // this는 super까지 탐색할 수 있다.
        System.out.println(this.y); // super.y
        System.out.println(super.y); // 동일한 값
    }
}
