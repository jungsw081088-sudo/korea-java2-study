package com.study._28_Enum;

import lombok.Getter;

/*
        결제 수단별 객체상수들을 정의해주세요
        수수료, 한글명 필드를 가짐
        price 받고, 수수료를 계산해서 리턴하는 메서드
        한글명 getter
        CASH - 현금 - 0
        CARD - 카드 - 2
        MOBILE - 핸드폰결제 - 5
    */
public enum Payment {
    // public static final Payment CASH = new Payment(0, "현금");
    CASH(0, "현금"),
    CARD(0, "카드"),
    MOBILE(0, "핸드폰결제"),
    ;

    private int feeRate;
    private String korName;

    Payment(int feeRate, String korName) {
        this.feeRate = feeRate;
        this.korName = korName;
    }

    public double calcFee(int price) {
        return this.feeRate * price / 100.0;
    }

    public String getKorName() {
        return this.korName;
    }
}
