package com.study._15_Class;

public class Car {
    String brand;
    String model;
    int year;

    // 속도 -> 변할 수 있음
    int speed;
    // 시동여부 -> 변할 수 있음
    boolean isEngineOn;

    // 필드값 + 동작(메서드)
    // 객체의 필드값을 참조하거나, 변경할 때, 논리적으로 검증된 값이 오게 작성
    void engineStart() {
        isEngineOn = true; // 객체의 필드값을 변경
        System.out.println("자동차 시동을 켰습니다!");
    }

    void engineStop() {
        isEngineOn = false;
        speed = 0;
        System.out.println("자동차 시동을 끕니다!");
    }

    void accelerate() {
        if (!isEngineOn) {
            System.out.println("시동을 먼저 켜주세요");
            return;
        }
        speed += 20;
    }

    void brake() {
        speed -= 20;
        if (speed < 0) {
            speed = 0;
        }
    }

}
