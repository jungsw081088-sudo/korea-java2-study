package com.study._13_MultiArray;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        // 다중배열 - 배열안에 배열이 존재하는 구조
        // 이중배열
        String[] seatA = {"A1", "A2", "A3"}; // heap: 0x1000
        String[] seatB = {"B1", "B2", "B3"}; // heap: 0x2000
        String[] seatC = {"C1", "C2", "C3"}; // heap: 0x3000

        // String[] -> 배열이저장하고있는자료형[]
        // String[][] -> String[] 저장하는 배열
        // String[][][] -> String[][] 저장하는 배열

        // seatA, seatB, seatC 의 자료형: String[]
        String[][] seats = {seatA, seatB, seatC};
        // seats가 가지고있는 0x5000에는 heap주소를 저장하고 있다.
        // 0x5000 -> [0x1000, 0x2000, 0x3000]

        // "B2" 데이터 읽기
        // seats[1] -> seatB
        String[] bSeat = seats[1];
        System.out.println(Arrays.toString(bSeat));

        // seatB[1] -> "B2"
        String B2 = bSeat[1];
        System.out.println(B2);

        // 한번에 찾아갈 수 있음
        B2 = seats[1][1];
        System.out.println(B2);

        // A3와 C2를 접근해서 출력!
        String A3 = seats[0][2];
        String C2 = seats[2][1];
        System.out.println(A3);
        System.out.println(C2);

        // 이중배열 출력
        // Arrays.toString()은 heap데이터를 한번만 찾아감
        System.out.println(Arrays.toString(seats));

        // 다차원배열일시 실제 값이 나올때까지 추적해서 출력
        // Arrays.deepToString()
        System.out.println(Arrays.deepToString(seats));


        // 바깥for문 배열안에 배열을 꺼내고
        // 안쪽for문 꺼낸 배열의 내부를 순회
        for(int i = 0; i < seats.length; i++) {
            // seats 안에 있는 배열들을 가져온다
            String[] seat = seats[i];
            for(int j = 0; j < seat.length; j++) {
                System.out.print(seat[j] + " ");
            }
            System.out.println(); // 엔터키
        }

        // int[] 을 저장하는 배열
        int[][] nums = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        // nums에 있는 데이터들에서 짝수들을 모두 더한 값을 출력해주세요

        // 짝수들 누적합 할 변수
        int evenSum = 0;
        for(int i = 0; i < nums.length; i++) {
            int[] numArr = nums[i]; // 숫자배열
            for(int j = 0; j < numArr.length; j++) {
                int myNum = numArr[j]; // 숫자데이터
                if(myNum % 2 == 0) { // 짝수면
                    // 누적합
                    evenSum += myNum;
                }
            }
        }

        System.out.println("짝수합: " + evenSum);






    }
}
