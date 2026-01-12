package com.study._09_While;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Random random = new Random();

        // 1이상 11미만 랜덤정수
        int num = random.nextInt(1, 11);
        System.out.println(num);

        Scanner scanner = new Scanner(System.in);
        int myNum = 0;
        // 랜덤숫자를 맞출때 (num != myNum)탈출
        while(num != myNum) {
            System.out.print("1~10 사이 숫자입력 >");
            myNum = scanner.nextInt();

            if(myNum == num) {
                System.out.println("정답! : " + num);
            } else {
                System.out.println("땡! 다시입력하세요!");
            }
        }


    }
}
