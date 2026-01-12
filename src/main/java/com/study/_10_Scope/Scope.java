package com.study._10_Scope;

public class Scope {
    public static void main(String[] args) {
        // 스코프: 변수의 생존 범위
        // 선언된 중괄호 안쪽으로 생존가능하다 - java
        int m = 10;
        if(true) {
            int x = 20;
            System.out.println(m); // 안쪽이기때문에 생존o
        } // 변수x 생존 종료
        // 컴파일러가 지역변수 사용을 막는다.
        // System.out.println(x);

        {
            int b = 30;
            {
                System.out.println(b); // b생존
            }
        } // b 생존불가
        // System.out.println(b);

        for (int i = 0; i < 2; i++) {
            // 변수 i는 for문 중괄호 안에서만 생존
        } // i 생존불가
        // System.out.println(i);
        int i = 10; // for문의 i와는 다른 i
    }
    // 변수m 생존 종료
}
