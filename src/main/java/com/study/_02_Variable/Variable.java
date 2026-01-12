package com.study._02_Variable;

public class Variable {
    public static void main(String[] args) {
        // 변수
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");

        // 변수쓰는 이유? 재사용성
        // 자료형 변수이름
        String greeting; // 변수 선언(빈 박스)
        // "=" 같다라는 수학적인 등호가 x,
        // 우변에 있는 데이터를 좌변에 대입하겠다.
        greeting = "hello"; // 변수 초기화(박스에 데이터 넣기)
        System.out.println(greeting);
        greeting = "world!"; // 재할당
        System.out.println(greeting); // world!

        // 변수 선언 및 초기화
        String academy = "koreait";

        /*
            자바의 명명법
            1. 필수규칙(문법)
                String 1name // 숫자로 시작 불가
                String my name // 공백 불가
                String class
                String if // 예약어 사용불가
            2. 관례
                파스칼 표기법: ex) MyName 첫글자는 대문자, 띄어쓰고 다음글자는 대문자
                - 클래스명은 파스칼표기법
                카멜 표기법: ex) myName 첫글자는 소문자, 띄어쓰고 다음글자는 대문자
                - 변수명은 카멜표기법
                ex) numberOfItemsCurrentlyInShoppingCart

                패키지명: 모두 소문자
                상수명: 모두 대문자
        */

    }
}
