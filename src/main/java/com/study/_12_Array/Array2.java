package com.study._12_Array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        // 참조자료형의 특징 - "."으로 참조가 가능하다
        // 배열(Array) 또한 참조자료형

        // 배열 유틸
        int[] original = {1, 2, 3, 4, 5};

        // Arrays.toString(배열) : 배열내부를 보는방법
        System.out.println(Arrays.toString(original));

        // 얕은 복사 - 대입연산은 stack메모리에 있는 값을 복사
        int[] copy1 = original;

        // 깊은복사 - heap에 새로운 메모리를 할당해서 실제 값을 복사
        int[] copy2 = Arrays.copyOf(original, original.length);

        System.out.println(Arrays.toString(copy1));
        original[0] = 999; // original의 0번 인덱스 변경

        // 얕은복사 - original이 바뀌었는데 변경됨
        System.out.println(Arrays.toString(copy1));

        // 깊은복사 - original이 바뀌었는데 변경되지 않음
        System.out.println(Arrays.toString(copy2));

    }
}
