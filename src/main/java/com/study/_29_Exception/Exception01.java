package com.study._29_Exception;

public class Exception01 {

    public static void m1() throws MyCheckedException {
        System.out.println("m1 호출됨!");
        m2();
    }

    // throws: 나를 호출한 쪽에게 예외처리를 전파하겠다.
    // throws 전파할예외클래스
    public static void m2() throws MyCheckedException {
        System.out.println("m2 호출됨!");

        // 의도적으로 예외를 생성(throw)
        // throw new MyRuntimeException("m2에서 런타임에러발생!");
        // 체크예외는 컴파일전에 try - catch가 강제
        throw new MyCheckedException("m2에서 체크예외발생!");
    }


    public static void main(String[] args) {
        /*
            예외도 2가지 존재
            1. Checked Exception - 컴파일시점에 검사가 강제되는 예외
            2. Unchecked Exception - 런타임시점에 검사
        */

        // 호출 역순으로 예외객체가 이동하는 것을 예외 전파
        // m2에서 예외 발생! JVM은 코드진행을 즉시멈추고
        // 해당 예외객체 타입을 받아주는 catch찾는다.
        // m2 catch x -> m1 catch x -> main catch x
        // -> 콘솔에 에러출력
        try {
            m1();
        } catch (MyRuntimeException e) {
            System.out.println("main에서 처리할게요");
            System.out.println(e.getMessage());
        } catch (MyCheckedException e) {
            System.out.println("main에서 처리할게요2");
            System.out.println(e.getMessage());
        }
    }
}
