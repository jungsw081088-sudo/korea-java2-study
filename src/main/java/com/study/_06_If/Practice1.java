package com.study._06_If;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // if ~ else if ~ else 문을 사용
        // bmi 계산 = 체중(kg) / 키*키(m^2)
        // 철수(174cm, 70kg)의 비만도를 출력
        // bmi 30이상이면 비만
        // 25 ~ 30이면 과체중
        // 18.5 ~ 25이면 정상
        // 18.5 미만이면 저체중
        int weight = 70;
        // 사칙연산에 더 큰 자료형이 있으면 결과는 더 큰 자료형
        double height = 174 / 100.0; // 자동형변환
        double bmi = weight / (height * height); // 자동형변환

        if(bmi >= 30) {
            System.out.println("비만");
        } else if(bmi >= 25) {
            System.out.println("과체중");
        } else if(bmi >= 18.5) {
            System.out.println("정상");
        } else {
            System.out.println("저체중");
        }

        // 스캐너 생성
        Scanner scanner = new Scanner(System.in);
        // 점수입력
        System.out.print("점수를 입력해 주세요(1~100) >");
        int score = scanner.nextInt();

        // 입력받은 점수에 따라 학점을 판정해 주세요
        // 90이상 A, 80~89 B, 70~79 C, 60~69 D, 60미만 F
        String grade = "";

        // score >= 0 || score <= 100
        // if문 중첩이 가능하다
//        if(score >= 0 || score <= 100) {
//            if(score >= 90) {
//                grade = "A";
//            } else if(score >= 80) {
//                grade = "B";
//            } else if(score >= 70) {
//                grade = "C";
//            } else if(score >= 60) {
//                grade = "D";
//            } else {
//                grade = "F";
//            }
//        } else {
//            System.out.println("점수는 0~100 값이어야 합니다.");
//        }

        // 사용자가 입력하지 말아야할 조건?
        // score < 0 || score > 100
        boolean isWrongScore = score < 0 || score > 100;

        // 얼리리턴
        if (isWrongScore) {
            System.out.println("점수는 0~100 값이어야 합니다.");
            return; // 리턴을 만나면 즉시 메서드 종료(main 종료)
        }

        if(score >= 90) {
            grade = "A";
        } else if(score >= 80) {
            grade = "B";
        } else if(score >= 70) {
            grade = "C";
        } else if(score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // A,B학점이면 "장학금대상" 출력, 이외에는 "장학금아님" 출력
        boolean isAGrade = grade.equals("A");
        boolean isBGrade = grade.equals("B");
        String sentence;
        if(isAGrade || isBGrade) {
            sentence = "장학금 대상";
        } else {
            sentence = "장학금 대상이 아닙니다";
        }

        System.out.println("점수: " + score + "점");
        System.out.println("학점: " + grade);
        System.out.println(sentence);


    }
}
