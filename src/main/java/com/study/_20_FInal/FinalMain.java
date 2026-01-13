package com.study._20_Final;

public class FinalMain {
    public static void main(String[] args) {
        // final: 반드시 "한번"만 "초기화" 되게 하세요!
        final int data1;
        data1 = 10;
        // 1. 재대입이 불가능
        // data1 = 20;

        // 재대입 불가능
        final int data2 = 20;
        // data2 = 30;
        // 2. 반드시 초기화가 되어야 한다.

        FinalStudent st1
                = new FinalStudent("김자바", 2026001, 20);
        st1.printInfo("자바고등학교");
        st1.setAge(21);

        final FinalStudent st2
                = new FinalStudent("이자바", 2026002, 20);

        st2.setAge(21); // 가능

        // final 키워드가 붙어져있는데, 객체의 필드값이 변경가능한가?
        // 결론: final은 stack메모리에 있는 값을 변경하지 못하게 막는 것

        // 상수
        // 매직넘버, 매직스트링
        String gameName = "리그오브 레전드";
        String gameMode = "소환사의 협곡";
        int playerCount = 10;

        System.out.println("게임명: " + Constant.GAME_NAME);
        System.out.println("게임모드: " + Constant.BATTLE_MODE);
        System.out.println("플레이어 수: " + Constant.PLAYER_COUNT);

        int playerLevel = 18;
        // 레벨업 로직
        if(playerLevel + 1 > Constant.MAX_LEVEL) { // 18레벨이 최대레벨
            System.out.println("이미 최대레벨에 도달했습니다.");
        } else {
            System.out.println("레벨업!");
            playerLevel++;
        }

        int price = 100000; // 사용자 입력값
        // 5만원 이상 결제시 10프로 할인
        double discountPrice = 0.0;
        if (price > Constant.DISCOUNT_THRESHOLD) { // 할인경계 초과면~
            double discountAmount = price * Constant.DISCOUNT_RATE; // 할인율
            discountPrice = price - discountAmount;
        } else {
            discountPrice = price;
        }
        System.out.println("최종결제액: " + discountPrice);

    }
}
