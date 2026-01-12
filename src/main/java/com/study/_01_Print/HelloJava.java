package com.study._01_Print;

/*
    자바의 특징
    - 객체지향 언어
    : class 위주의 설계, 메모리관리, 코드
    자바 프로그램의 실행과정
    1. 자바 코드를 작성(.java 파일)
    2. 컴파일 과정
    - .java -> .class 변환 - 바이트코드(숫자)로 변환
    3. JVM이 .class파일을 읽고, 실행!
*/

public class HelloJava { // HelloJava 클래스 시작
    // 주석: 인간이 읽는 메모, 설명을 적어 놓는것
    /*
    여러줄 주석
    */
    // main 메서드(함수) - 자바프로그램의 현관문
    // 자바는 항상 main이라는 함수를 실행시키면서 시작
    public static void main(String[] args) { // main 시작
        // System.out.println() 콘솔창에 데이터를 보여주는 메서드
        System.out.println("Hello world!"); // 세미콜론: 코드작성 끝
        System.out.println("안녕하세요!");
        // 실습) 이름을 출력해보세요!
        System.out.println("박화목");
    } // main 끝

} // 클래스 끝
