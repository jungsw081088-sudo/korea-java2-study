package com.study._29_Exception;

public class HandleException {
    // 자바의 예외?
    public static void main(String[] args) {
        /*
            오류 - Error, Exception
            Error - 자바환경에서 통제할 수 없는 에러
            Exception - 자바개발자가 처리 가능한 오류
            비정상적인 상황들을 클래스로 정의해 놓았음
        */

        int a = 10;
        int b = 1;
        // int result = a / b;
        // 사전에 정의되어있는 예외상황이 되면
        // 자동으로 예외객체가 생성됨
        // JVM은 객체를 감지하고, 코드진행을 즉시 멈춤
        System.out.println("실행중입니다!");

        // 예외상황이 일어날것을 미리 알고, 처리할 수 있음
        try {
            // 예외가 일어날 가능성있는 코드
            int result = a / b;
            // JVM이 예외객체를 들고 해당 타입예외를 잡아줄
            // catch를 찾으러 감 -> 있으면 매개변수에 넣어줌
            System.out.println("실행될까요?");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안됩니다!");
        } finally {
            // 예외가 발생하건, 안하건 항상 실행되는 구문
            // 자원반납 - scanner.close(), JDBC에서 커넥션반납..
            System.out.println("저는 항상 실행됩니다.");
        }


    }
}
