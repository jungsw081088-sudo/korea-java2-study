package com.study._21_Inheritance;

public class GasCar extends Car {
    private int fuelLevel;

    // 기본생성자
    public GasCar() {
        // super() - 생략되어있음
        System.out.println("GasCar 기본 생성자 호출!");
        this.fuelLevel = 100;
    }

    public GasCar(String brand) {
        // super(brand); -> 생략하면 super()자동으로 삽입됨
        super(brand);
        this.fuelLevel = 100;
    }

    // @Override를 작성하면, 컴파일러가 부모의 시그니처를 탐색해서
    // 동일한게 있는지 탐색해준다. 없으면 컴파일에러
    @Override // @ 어노테이션(@) Override
    public void move() {
        System.out.println("가솔린차가 이동합니다.");
    }
}
