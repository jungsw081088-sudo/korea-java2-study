package com.study._11_BreakContinue;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        // break
        // 반복문(for, while) 내에서 break를 읽으면, 반복문의 중괄호를 한번 탈출

        for (int i = 1; i <= 10; i++) {
            System.out.println("현재번호: " + i);
            // i가 3이면 탈출
            if(i == 3) {
                break; // for문의 중괄호 탈출
            }
        } // break읽으면, 여기로 탈출

        // 웨이팅 - 50명
        // 재고 - 10개분
        int waiting = 50;
        int stock = 10;
        for (int i = 1; i <= waiting; i++) { // 50번 반복
            System.out.println(i + "번째 손님 입장!");
            if(i == stock) { // 10번째 반복때 탈출
                System.out.println("재고 소진");
                System.out.println("영업 종료!");
                break; // 반복문탈출
            }
        }

        String password = "1q2w3e4r";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // 비밀번호를 입력받고
            System.out.print("비밀번호 입력 >>");
            String myInput = scanner.nextLine();

            // 조건문으로 password와 동일할 경우 break
            // == 연산자 -> stack메모리 값 비교
            boolean isSamePW = password.equals(myInput);
            if (isSamePW) {
                System.out.println("로그인성공!");
                break; // 반복문의 중괄호 한번 탈출
            }

        } // 여기로 탈출

        // sum변수에 1 ~ 100 누적합을 해주세요
        int sum = 0;
        // 이때, sum이 가진 값이 200이 넘어가면 스탑!
        // 스탑했을때 마지막으로 더한 숫자, 최종합계 출력!
        for (int i = 1; i <= 100; i++) {
            // sum = sum + i;
            sum += i;
            if (sum > 200) {
                System.out.println("마지막으로 더한 수: " + i);
                System.out.println("최종합: " + sum);
                break; // 스탑
            }
        }

    }
}
