package com.study._19_Static;

public class StaticMethod {
    // 각 객체마다 가지고 있다
    private int instanceVal;

    // 클래스마다 가지고 있다 -> 클래스로부터 나온 객체는 모두 공유
    private static int staticVal;


    public static void staticMethod() {
        // instanceVal 인스턴스변수에 접근할 수 없음.
        // -> 인스턴스변수는 new가 호출된 다음에 생겨남
        // staticMethod는 더 빨리 메모리에 로드되었음

        // 인스턴스 메서드는 this가 없으면 호출이 불가능하다.
        // 근데 this는 객체가 생성되야 생성되는 것.
        // instanceMethod();

        staticVal++; // 스태틱변수는 접근 가능
    }


    public void instanceMethod() {
        // 작성하지는 않았지만, 내부적으로 this매개변수를 가지고 있음
        this.instanceVal++;

        // new가 호출되는 시점은
        // main 시작 이후다.
        staticVal++;
        staticMethod();
    }


}
