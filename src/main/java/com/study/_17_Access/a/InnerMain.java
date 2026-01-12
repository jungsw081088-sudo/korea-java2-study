package com.study._17_Access.a;

public class InnerMain {
    public static void main(String[] args) {
        // 클래스에 선언된 생성자가 없으면
        // 기본생성자를 컴파일러가 알아서 추가해 줌
        MyData myData = new MyData();

        // public
        myData.publicField = 1; // 가능
        myData.publicMethod(); // 호출가능

        // default - 같은패키지라서
        myData.defaultField = 2;
        myData.defaultMethod();

        // private - 클래스 내에서만 접근
        // -> 접근하려면 열려있는 메서드로 접근
        // myData.privateField = 3;
        myData.inner(3); // 안전하게 상태를 변경 or 조회가능
    }
}
