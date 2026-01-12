package com.study._12_Array;

import java.util.Arrays;

public class StackHeap {
    public static void main(String[] args) {
        // .java 코드 작성 -> 컴파일러가 컴파일: .class
        // .class 파일을 읽고 실행하는 주체: JVM
        // stack 과 heap은 JVM의 메모리(ram)
        // stack: 고정크기, 작은크기, 빠르게 접근가능
        // heap: 유동적인크기, 큰 크기, 상대적으로 느리게 접근

        int age = 25;
        boolean isStudent = true;
        /*
        현재 stack:
        -main stack-
        age: 25
        isStudent: true
        -heap-
        비어있음
        */

        // new 연산을 컴파일러가 대신함
        int[] scores = {85, 90, 70}; // 참조자료형
        /*
        -main stack-
        age: 25
        isStudent: true
        scores: 0x1000(heap메모리 주소)

        -heap-
        0x1000: 85
        0x1004: 90
        0x1008: 70
        // scores[1] -> 0x1000에서 int자료형 크기*1 만큼 내려가서 찾자
        */

        // 변수에 변수를 대입하는 것 -> stack값을 복사해서 대입하는 것
        int[] copy = scores;
        /*
        -main stack-
        age: 25
        isStudent: true
        scores: 0x1000(heap메모리 주소)
        copy: 0x1000(heap메모리 주소) -- 복사

        -heap-
        0x1000: 85
        0x1004: 90
        0x1008: 70
        */

        // heap에 새로운 메모리를 할당해서 실제 값을 복사
        int[] copy2 = Arrays.copyOf(scores, scores.length);
        /*
        -main stack-
        age: 25
        isStudent: true
        scores: 0x1000(heap메모리 주소)
        copy: 0x1000(heap메모리 주소) -- 얕은복사
        copy2: 0x2000(새로운 heap메모리 주소) -- 깊은복사

        -heap-
        0x1000: 85 -> 999
        0x1004: 90
        0x1008: 70
        0x2000: 85
        0x2004: 90
        0x2008: 70
        */

    }
}
