package com.study._17_Access.b;

import com.study._17_Access.a.MyData;

public class OuterMain {
    public static void main(String[] args) {
        MyData myData = new MyData();

        // public
        myData.publicField = 1; // 가능
        myData.publicMethod(); // 호출가능

        // default - 같은패키지가 아니라서 불가능
        // myData.defaultField = 2;
        // myData.defaultMethod();

        // private - 클래스 내부가 아니니 불가능
        // myData.privateField = 3;
        myData.inner(3); // public으로 열려있는 방법

        // 컴파일단계에서 접근제어자를 검증
        // 접근제어자의 주도권은 컴파일러에게 있다.
        // .java -> .class -> JVM이 실행

    }
}
