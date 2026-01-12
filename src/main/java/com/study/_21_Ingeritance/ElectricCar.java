package com.study._21_Ingeritance;

import com.sun.security.jgss.GSSUtil;

// 자식클래스
// 상속받는 방법 -> 클래스 이름 extends 상속받을 클래스명
public class ElectricCar extends Car {
    private int batteryLevel; // 전기차만의 필드

    // 자식의 기본생성자
    // 자식의 생성자를 호출하면, 부모의 생성자가 가장 처음 호출됨
    // 부모의 필드를 먼저 초기화 ->  자식의 필드가 초기화됨
    public ElectricCar() {
        super(); // 부모의 생성자 호출
        // super() 은 생략가능

        System.out.println("전기차 생성자 호출");
        this.batteryLevel = 100;
    }

    public ElectricCar(String brand) {
        super(brand); // 얘는 가장 먼저 실행되어야 함
        this.batteryLevel = 100;
    }

    public void charge() {
        System.out.println("충전중");
    }

    public void moveWithInfo() {
        super.move();
    }
}
