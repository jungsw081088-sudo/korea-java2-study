package com.study._14_Method;

public class Method {
    // public(접근제한자) - 나중에
    // static(객체 생성없이) - 나중에
    // void -> 리턴이 없다.
    // "접근제한자" "스태틱유무" "리턴자료형" 함수명(매개변수들..) {}
    public static void hello() { // 매개변수x, 리턴x
        System.out.println("hello world!");
    } // 메서드 정의: 호출되면 코드를 실행하라!

    // 매개변수: 변수부분을 외부로부터 받아올 수 있음
    // 함수의 매개변수는 함수 안에서만 생존
    public static void helloName(String name) {
        System.out.println("안녕하세요");
        System.out.println(name + "님 반갑습니다.");
    }

    public static void main(String[] args) {
        /*
            메서드를 사용하는 이유
            변수: 데이터를 재사용하려고
            메서드: 코드블럭을 재사용하려고
            주의) 메서드 호출과 정의를 헷갈리지 말자!
        */
        System.out.println("함수 호출 전");
        hello(); // 함수호출
        System.out.println("함수 호출 후");

        String myName = "홍길동";
        // name(매개변수) = myName; -> stack값 복사해서 대입
        helloName(myName); // 매개변수의 자료형만 맞춰주면 된다.

        // JVM메모리의 stack메모리
        /*
        stack 메모리 공간은 함수호출로 생성된다.
        호출된 함수별로 분리된 공간을 가지고 있음

        stack(main)--
        myName: 0x1000(홍길동 문자열의 주소)
        ---
        stack(helloName)--
        name: 0x1000(홍길동 문자열의 주소)
        --
        heap
        0x1000: "홍길동"
        */


    }
}
