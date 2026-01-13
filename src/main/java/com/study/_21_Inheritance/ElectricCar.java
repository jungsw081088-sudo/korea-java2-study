package com.study._21_Inheritance;

// 자식클래스
// 상속 받는방법 -> 클래스이름 extends 상속받을 클래스명
public class ElectricCar extends Car {
    // private year -> x
    // protected brand -> 필드를 상속받아서 가지고 있음
    private int batteryLevel; // 전기차만의 필드

    // 자식의 기본생성자
    // 자식의 생성자를 호출하면, 부모의 생성자가 가장 처음 호출됨
    // 부모의 필드를 먼저 초기화 -> 자식의 필드가 초기화 됨
    public ElectricCar() {
        super(); // 부모의 생성자 호출
        // super()는 생략가능 - 부모의 기본생성자는 생략가능

        System.out.println("전기차 생성자 호출!");
        this.batteryLevel = 100;
    }

    public ElectricCar(String brand) {
        // 제약사항: super()호출은 생성자호출시 가장 먼저 실행되어야함
        super(brand); // 브랜드만 초기화하는 부모생성자 호출
        this.batteryLevel = 100;
    }


    // this != this()
    // super != super()
    // super.필드 : heap영역에서 부모영역만 탐색해서 보겠다.
    // super.메서드() : 부모클래스 기준에서 호출하겠다.
    public void moveWithInfo() {
        super.move(); // 부모의 메서드 접근
        // super.brand // 부모로부터 물려받은 필드접근 가능
        // this.brand // super는 this에서 물려받은 부분을 가르킴
    }

    // 자식만 가지고있는 필드를 사용하는 인스턴스메서드
    public void charge() {
        System.out.println("배터리를 충전합니다.");
        this.batteryLevel = 100;
    }



}
