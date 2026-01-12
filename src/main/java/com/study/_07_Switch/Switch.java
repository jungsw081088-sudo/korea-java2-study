package com.study._07_Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // switch - 값에 따라 분기시키는 문법
        int rank = 5;
        // if문은 true, false에 따라 분기

        // 해당되는 case로 코드진행이 이동
        switch (rank) {
            case 1:
                System.out.println("1등");
                break; // 가장 가까운 switch 중괄호 탈출
            case 2: // 여기서부터 코드 진행
                System.out.println("2등");
                break;
            case 3:
                System.out.println("3등");
                break;
            default: // 값과 같은 case가 없을때
                System.out.println("기본!");
                break;
        }
        System.out.println("탈출!");

        int month = 10;
        // 345 봄
        // 678 여름
        // 9 10 11 겨울
        switch (month) {
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
        }

        // 요일마다 다른 할인율을 적용
        Scanner scanner = new Scanner(System.in);
        System.out.print("요일을 입력해 주세요 >>");
        String dayOfWeek = scanner.nextLine();

        // 입력값 가공 - "월", "월요일" 모두 switch문을 통과하게
        // if문
//        if (!dayOfWeek.endsWith("요일")) {
//            // ~요일로 끝나지 않으면 실행
//            dayOfWeek = dayOfWeek + "요일";
//        }

        // 삼항연산자
//        dayOfWeek = dayOfWeek.endsWith("요일")
//                ? dayOfWeek
//                : dayOfWeek + "요일";

        // 사용자가 소문자로 입력해도
        // SWITCH문을 통과할수 있게
        // .toUpperCase():모든 알파벳을 대문자로
        // .toLowerCase():모든 알파벳을 소문자로
        dayOfWeek = dayOfWeek.toUpperCase();


        // 기본가격
        int basePrice = 10000;
        double discountRate; // 할인율

        // switch문 작성! dayOfWeek입력값에 따라 분기
        // 월요일 - 10% 할인
        // 화, 수, 목요일 - 5% 할인
        // 금 - 15% 할인
        // 토,일 - 20% 할인
        switch (dayOfWeek) {
            case "MON":
                discountRate = 0.1; break;
            case "TUE": case "WED": case "THU":
                discountRate = 0.05; break;
            case "FRI":
                discountRate = 0.15; break;
            case "SAT": case "SUN":
                discountRate = 0.2; break;
            default:
                discountRate = 0.0;
                System.out.println("올바른 요일을 입력하세요");
        }

        double discountPrice = basePrice * discountRate;
        double finalPrice = basePrice - discountPrice;

        System.out.println("정가: " + basePrice);
        System.out.println("할인금액: " + discountPrice);
        System.out.println("최종가격: " + finalPrice);

    }
}
