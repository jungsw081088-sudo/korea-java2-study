package com.study._21_Ingeritance;

public class CastingMain {
    public static void main(String[] args) {
        ElectricCar eCar1 = new ElectricCar();
        eCar1.charge();
        Car car1 = (Car) eCar1; // 업캐스팅 (자식객체) -> 부모타입
    }


}
