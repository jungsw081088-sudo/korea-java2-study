package com.study._30_Generic;

public class Main {
    public static void main(String[] args) {
        // 자바에 존재하는 모든 참조자료형이
        // 업캐스팅 된 상태로 ObjectBox의 필드로 들어갈 수 있음
        ObjectBox box1 = new ObjectBox("500"); // String
        ObjectBox box2 = new ObjectBox(100); // Integer

        // 업캐스팅해서 데이터를 넣어줬기 때문에 다운캐스팅을 해줘야함
        // 1. 코드가 방대해진다
        // 2. 다운캐스팅 -> 런타임에러, 사전에 알 수 없다.
        // *) instanceof는 런타임에 동작하는 연산자
        if (box1.getItem() instanceof String) {
            String myData = (String) box1.getItem();
            System.out.println(myData);
        }

        // 제너릭타입(컴파일타입)
        // 클래스나 메서드에서 타입을 미리 정의하지 x
        // 사용하는 측에서 타입을 지정하는 문법

        // 꺽쇄부분은 컴파일러만 읽음
        Box<String> gBox1 = new Box<>("데이터!");
        Box<Integer> gBox2 = new Box<>(500);

        // 1. 컴파일러가 알아서 업캐스팅, 다운캐스팅을 해줌
        // 2. 잘못된 제너릭문법? -> 컴파일에러 발생
        // -> 캐스팅을 컴파일러에게 일임하는 문법

    }
}
