package com.study._08_For;

public class NestedFor {
    public static void main(String[] args) {
        // 2중 for문

        for (int day = 1; day <= 7; day++) {
            System.out.println(day + "일 살았음");
        } // for문 전체를 일주일로 치환해서 생각할 수 있음

        // 바깥반복이 한번반복될때 안쪽반복이 전체반복
        for (int week = 1; week <= 4; week++) {
            System.out.println(week + "주 시작!");
            for (int day = 1; day <= 7; day++) {
                System.out.println("\t" + day + "일 살았음");
            }
            System.out.println(week + "주 끝!");
        }

        /*
            2단시작!
                2 x 1 = 2
                2 x 2 = 4
                ...
                2 x 9 = 18
            2단끝!
            3단시작!
                3 x 1 = 3
                3 x 2 = 6
                ...
                3 x 9 = 27
            3단끝!
        */
        for(int dan = 2; dan <= 9; dan++) {
            System.out.println(dan + "단 시작!");
            for(int i = 1; i <= 9; i++) {
                System.out.println("\t" + dan + "x" + i + "=" + dan * i);
            }
            System.out.println(dan + "단 끝!");
        }

        /*
            *****
            *****
            *****
            *****
            *****
        */


        for (int j = 0; j < 5; j ++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("*"); // *키 누름
            }
            System.out.println(); // 엔터
        }


    }
}
