package com.study._20_FInal;

public class FinalMain {
    public static void main(String[] args) {
        Constant constant = new Constant();

        FinalStudent st1 = new FinalStudent("김자바", 2026001, 20);

    int playerLevel = 18;
    if(playerLevel + 1 > constant.MAX_LEVEL) {
        System.out.println("이미 최대레벨에 도달했습니다.");
    } else {
        System.out.println("레벨업");
        playerLevel++;
    }

        int price = 100000;
        // 5만원 이상 결제시 10프로 할인
        double discountPrice = 0.0;
        if (price > 50000) {
            double discountAmount = price * 0.1;
            discountPrice = price - discountAmount;
        } else {
            discountPrice = price;
        }
        System.out.println("최종결제액" + discountPrice);
    }


}
