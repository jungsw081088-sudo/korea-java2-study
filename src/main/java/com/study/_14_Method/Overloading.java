package com.study._14_Method;

public class Overloading {
    // 컴파일러가 메서드를 구분하는 방법
    // - "메서드 시그니처"
    // 이름 + 매개변수 자료형 목록
    
    // 시그니처: printInfo(1:String)
    public static void printInfo(String name) {
        System.out.println("이름: " + name);
    }

    // 매개변수가 다르니까 오버로딩 가능
    // 시그니처: printInfo(1:String, 2:int)
    public static void printInfo(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

    // 매개변수의 순서가 달라도 오버로딩 가능
    // 시그니처: printInfo(1:int, 2:String)
    // 매개변수의 변수명은 상관없다(인식 하지 않음)
    public static void printInfo(int age, String name) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

//    public static void printNum(int num) {
//        System.out.println("정수!");
//        System.out.println(num);
//    }

    public static void printNum(double num) {
        System.out.println("실수!");
        System.out.println(num);
    }



    public static void main(String[] args) {
        /*
            자바에서는 메서드는 단독으로 존재할 수 없다.
            -> 반드시 클래스에 종속되어 있다.
            -> 서로 다른 클래스의 메서드면 이름이 같아도 된다.(오버로딩 x)

            메서드 오버로딩
            : 같은 클래스 내에서 같은 이름의 메서드를 여러개 선언하는 것
            매개변수(파라미터)의 자료형 / 순서 / 갯수가 다르면
            같은 이름을 사용 할 수 있음
        */

        printNum(1); // int 매개변수를 가지는 printNum 호출
        printNum(1.0); // double 매개변수를 가지는 printNum 호출

        // 만약에 int용 printNum 메서드가 없으면
        // 자동형변환이 될 수 있는 printNum 메서드를 호출

        // 1. 정확히 매칭되는 시그니처 메서드를 탐색
        // 2. 없을시, 자동 형변환이 가능한 시그니처 메서드를 탐색

    }
}
