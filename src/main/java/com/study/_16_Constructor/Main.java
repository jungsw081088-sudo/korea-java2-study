package com.study._16_Constructor;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("홍길동", 100, 90, 80);
        Student st2 = new Student("김길동", 80, 90, 100);
        /*
        stack(main)---
        st1: 0x1000
        st2: 0x2000
        ---
        heap(0x1000)---
        name: "홍길동"
        kor: 100
        eng: 90
        math: 80
        ---
        heap(0x2000)---
        name: "김길동"
        kor: 80
        eng: 90
        math: 100
        ---
        */

        int totalScore1 = st1.getTotalScore();
        int totalScore2 = st2.getTotalScore();
    }
}
