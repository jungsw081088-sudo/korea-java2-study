package com.study._08_For;

public class For {
    public static void main(String[] args) {
        /*
            반복문 - for문
            for(변수선언(초기식); 조건식; 증감식) {
                반복될 코드
            }
            초기식 -> (조건식 -> 코드실행 -> 증감식) x n
            -> 조건식결과가 false면 for문 중괄호 탈출
        */
        
        for (int i = 0; i < 10; i++) {
            // i라는 변수는 for문 내부에서만 사용가능
            System.out.println(i);
            if (true) {
                System.out.println(i); // 내부면 어디든 사용가능
            }
        }
        // System.out.println(i); i 사용 불가능
        
        int a = 0; // 외부변수를 사용하는 경우
        // a는 main함수 중괄호 내부에서 사용가능
        for(; a < 3; a++) {
            System.out.println(a);
        }
        System.out.println("for문 탈출한 a:" + a);

        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println("짝수: " + i);
            }
        }

        // 누적합
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            // sum = sum + i;
        }
        System.out.println("1~100 누적합: " + sum);

        // 1~100 반복문을 돌면서
        // 짝수합, 홀수합
        int evenSum = 0; // 짝수합
        int oddSum = 0; // 홀수합

        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        // 1~100 숫자 중 3의 배수와 7의 배수의 갯수를 구해주세요
        int count3 = 0; // 3의배수 갯수
        int count7 = 0; // 7의배수 갯수
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                count3++;
            }

            if (i % 7 == 0) {
                count7++;
            }
        }
        
        
    }
}
