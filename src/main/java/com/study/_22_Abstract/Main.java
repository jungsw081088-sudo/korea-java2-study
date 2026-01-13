package com.study._22_Abstract;

public class Main {
    public static void main(String[] args) {
        // 추상클래스는 직접 인스턴스(객체)를 만들 수 없음

        Warrior warrior1 = new Warrior("전사1"); // 생성

        // 컴파일러는 Character타입이면
        // attack() 메서드(시그니처)를 가지고 있는가? -> 있으니까 ok
        // JVM은 new로 생성된 객체(Warrior 객체)의 attack()을 호출
        Character warrior2 = new Warrior("전사2"); // 업캐스팅
        warrior2.attack(warrior1);
        warrior1.attack(warrior2);
        // Mage class 정의 - 80 30 마법미사일
        // Archer class 정의 - 100 20 다중화살

        Character target = new Warrior("바병뚜벅이");

        Character mage = new Mage("법사");
        Character archer = new Archer("궁수");
        Character warrior = new Warrior("전사"); // 생성

        Character[] party = {mage, archer, warrior};
        for (Character member : party) {
            member.attack(target);
        }
        // 추상클래스 상속 -> attack() 반드시 오버라이딩
        // -> 다형성 보장

    }
}
