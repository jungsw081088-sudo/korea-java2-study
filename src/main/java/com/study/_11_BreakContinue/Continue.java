package com.study._11_BreakContinue;

public class Continue {
    public static void main(String[] args) {
        // continue - 해당반복을 멈추고, 다음반복으로 바로 넘어감

        // 같은 요구사항이라도 구현은 다를 수 있음
        for(int i = 1; i <= 10; i++) {
            // 3의 배수면 출력하지 x
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);

            // -> 3의 배수가 아니면 출력
//            if (i % 3 != 0) {
//                System.out.println(i);
//            }
        }

        int waiting = 50; // 대기인원
        int stock = 10; // 재고
        int sold = 0; // 현재 판매량 카운팅
        int noShowNum = 11; // 노쇼
        for (int i = 1; i <= waiting; i++) {
            System.out.println(i + "번 손님 입장하세요~");

            if (i == noShowNum) {
                System.out.println(i + "번 손님 노쇼");
                continue; // 다음반복으로 스킵
            }
            sold++;

            if (sold == stock) {
                System.out.println("재료 소진!");
                System.out.println(i + "번째 손님까지 받았습니다");
                break;
            }
        }

    }
}
