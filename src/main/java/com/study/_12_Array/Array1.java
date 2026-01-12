package com.study._12_Array;

public class Array1 {
    public static void main(String[] args) {
        // Array(배열): 같은 자료형의 많은 데이터를 한번에 관리하는 저장자료형
        // 연속된 공간(메모리)에 위치하기 때문에 탐색시 유리(빠름)

        // 배열초기화 방법
        // 1. 자료형[] 변수명 = new 자료형[공간갯수];
        int[] scores = new int[5]; // int 데이터가 들어갈 5자리 배열생성
        scores[0] = 90;
        scores[1] = 80;
        // ...2,3
        scores[4] = 100;

        // 2. 초기화까지 한줄
        int[] scores2 = new int[]{90, 80, 40, 60, 100};
        int[] scores3 = {90, 80, 40, 60, 100};

        // 배열의 속성
        // 데이터의 갯수(길이) 배열.length
        System.out.println(scores3.length); // 5

        // for문으로 배열 순회
        String[] names = {"홍길동", "김길동", "박길동", "최길동", "이길동", "서길동"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        for(int i = 0; i < 5; i++) { // 배열에 데이터가 추가되면, 조건식도 바뀌어야함
            System.out.println(names[i]);
        }

        // 전형적인 배열의 순회 방식
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // 향상된 for문 - 항상 배열의 길이만큼 순회
        // for(배열에서 꺼내온 데이터를 담을 변수 : 배열)
        for(String name : names) {
            // name = names[0] ... names[names.length - 1]
            System.out.println(name);

            // 인덱스로 접근하는 것을 막는다.
        }

        // 실습) scores4의 평균을 구해주세요
        int[] scores4 = {80, 90, 75, 100, 65};
        // 평균 -> 데이터총합 / 배열의 길이
        double sum = 0.0; // 자동형변환 사용하기위해
        for(int score: scores4) {
            sum += score; // sum = sum + score
        }
        double avg = sum / scores4.length;
        System.out.println("평균: " + avg);

        String str1 = "손흥민";
        // 접두/접미검사
        // str1이 "손"으로 시작하는가? true / false
        System.out.println(str1.startsWith("손"));
        // str1이 "민"으로 끝나는가? true / false
        System.out.println(str1.endsWith("민"));
        // 포함여부검사
        // str1에 "흥민" 문자열이 존재하는가? true / false
        System.out.println(str1.contains("흥민"));

        // 실습2) "(상함)"이 포함된 음식을 빼고 출력해주세요
        String[] foods = {"김치", "우유", "달걀(상함)",
                "두부", "수박(상함)"};

        for(String food : foods) {
            // "(상함)"이 포함된 문자열이라면
            if(food.contains("(상함)")) {
                continue; // 스킵
            }

            System.out.println(food);
        }

        // scores4에서 평균이상의 점수는 몇개?
        // 최고 점수를 찾아주세요!
        int count = 0; // 평균이상 점수갯수
        for(int score : scores4) {
            if(score >= avg) {
                continue;
            }
            count++;
        }

        int max = 0; // 최고점수
        for(int score : scores4) {
            // 최대, 최소
            // 간단방법: 꺼내온 값이 최댓값보다 크면, 업데이트
            if (score > max) { // 꺼내온값이 현재 max보다 크다면
                max = score; // 그 값으로 업데이트 하겠다
            }
        }








    }
}
