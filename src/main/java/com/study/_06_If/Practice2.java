package com.study._06_If;


import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // 1. 스캐너생성
        // 2. int price를 입력받아주세요
        // 3. 10만원 이상을 입력하면 10% 할인가격 / 할인없는가격 출력

        Scanner scanner = new Scanner(System.in);
        System.out.print("상품의 가격을 입력하세요 >>");
        int price = scanner.nextInt();

        if (price < 0) {
            System.out.println("가격은 음수일 수 없습니다");
            return;
        }

        if (price >= 100000) {
            // 10% 할인 작성
            double discountPrice = price * 0.9;
            System.out.println("최종가격: " + discountPrice);
        } else {
            System.out.println("최종가격: " + price);
        }


    }
}
