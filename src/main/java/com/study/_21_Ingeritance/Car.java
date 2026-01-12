package com.study._21_Ingeritance;

// 부모클래스 - 기초설계도 역할
// 모든 차가 가져야 할 공통적인 필드, 기능(메서드)
// 공통필드, 공통메서드를 추려내는 자겅ㅂ ->  추상화
public class Car {
    private int year; // 생산연도
    // 상속받는 클래스만 접근가능
    protected String brand; // 브랜드명

    public Car() {
        System.out.println("기본생성자 호출!");
        this.brand = "기본차";
    }


    public Car(String brand) {
        this.brand = brand;
    }

    // 공통기능들
    public void move() {
        System.out.println("기본 차가 이동합니다.");
    }

    public void openDoor() {
        System.out.println("기본 차가 문을 엽니다.");
    }
}
