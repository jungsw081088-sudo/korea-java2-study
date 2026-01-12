package com.study._09_While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*
            while(조건식) {
                // 조건이 참인 동안 실행될 코드
            } // 조건식 결과가 false가되면 탈출

            (조건검사 -> 코드실행) x n
            -> 조건검사결과가 false가되면 탈출

            for문 - 횟수가 명확할 때
            while문 - 횟수가 불명확할 때
        */

        int count = 0; // 외부변수
        while (count < 3) { // 탈출조건
            count++; // 탈출조건을 조작하는 코드
            System.out.println("현재 count: " + count);
        }

        // 실습) 1~100 누적합을 하는데
        // 누적합이 1000이 넘어가면 탈출하는 while문 작성
        int sum = 0; // 누적합
        int num = 0;
        // while 작성
        while(sum < 1000) {
            num++;
            sum += num;
        }


        Scanner scanner = new Scanner(System.in);

        // 로그인상태
        boolean isLogin = true;
        while (isLogin) {
            System.out.println("로그인 상태입니다.");
            System.out.print("로그아웃 하시겠습니까?(y/n)");

            String inputValue = scanner.nextLine();
            // isLogin = !"y".equals(inputValue);
            if (inputValue.equals("y")) {
                isLogin = false;
            }
        }
        System.out.println("로그아웃 완료!");



    }
}
