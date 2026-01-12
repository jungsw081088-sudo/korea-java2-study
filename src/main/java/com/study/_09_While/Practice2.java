package com.study._09_While;

import java.util.Random;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Random random = new Random();
        // 1이상 101미만 랜덤정수
        int num = random.nextInt(1, 101);
        Scanner scanner = new Scanner(System.in);
        int myNum = 0;
        // 입력값보다 랜덤값이 크면 "up"
        // 입력값보다 랜덤값이 작으면 "down"
        // 같으면 "정답입니다" 출력하고 반복문 탈출
        // + (반복횟수 출력)
        int count = 0;
        while(myNum != num) {
            count++;
            System.out.print("1~100 사이 정수를 입력 >>");
            myNum = scanner.nextInt();

            System.out.println("현재시도횟수: " + count);
            if(myNum < num) {
                System.out.println("up");
            } else if (myNum > num) {
                System.out.println("down");
            } else { // myNum == num
                System.out.println("정답입니다!");
            }
        }


    }
}
