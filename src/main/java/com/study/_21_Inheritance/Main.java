package com.study._21_Inheritance;

public class Main {
    public static void main(String[] args) {
        // 자식의 기본생성자 호출
        ElectricCar eCar = new ElectricCar();

        eCar.move(); // Car의 메서드
        eCar.openDoor(); // Car 메서드
        eCar.moveWithInfo(); // super.move()를 내부적으로 호출
        eCar.charge(); // 전기차만의 메서드

        // 오버라이드
        GasCar gCar = new GasCar("현대"); // super(brand)
        gCar.openDoor(); // Car의 메서드
        // 부모와 동일한 메서드(메서드 시그니처가 동일)를 정의하면
        // 메서드 시그니처 - 메서드 이름, 매개변수 수, 매개변수 순서, 반환타입
        // 부모의 메서드는 무시된다. -> 덮어쓰기가 되버림
        gCar.move(); // Car의 메서드가 아닌 GasCar메서드가 호출

        // 자식객체가 메서드를 호출하면, 자식클래스 정보에 메서드가 있는지 확인
        // -> 없으면 부모클래스로 찾아가서 탐색한다.

        // Override를 강제하면 -> 특정 클래스를 상속받은 클래스의 객체들은
        // 오버라이드된 메서드를 반드시 가지고 있게 된다.
        // -> 호출이 보장된다.
    }
}
