package com.study._22_Abstract;

public class Main {
    public static void main(String[] args) {
        // Character ch = new Character("홍길동", 100, 50);
        // 추상클래스는 직접 인스턴스(객체)를 생성할 수 없음


        Warrior warrior1 = new Warrior("전사1"); // 생성

        // 컴파일러는 Character타입이면
        // attack() 메서드(시그니처)를 가지고 있는가? -> 있으니까 ok
        // JVM은 new로 생성된 객체(Warrior 객체)의 attack()을 호출
        Character warrior2 = new Warrior("전사2"); // 업캐스팅
        warrior2.attack(warrior1);

        warrior1.attack(warrior2);

        // 실습 Character를 상속받는
        // 1. Mage class 정의해주세요 - 체력80, 공격력 30, 마법미사일
        // 2. Archer class 정의해주세요 - 체력 100, 공격력 20, 다중화살

        Character mage = new Mage("짱법사");
        Character warrior = new Warrior("짱전사");
        Character archer = new Archer("짱궁수");

        Character target = new Warrior("몸빵맨");

        // 업캐스팅된 타입배열로 상속받은 자식들을 관리가능
        Character[] party = { mage, warrior, archer };

        // attack() 메서드는
        // 각 객체가 모두 동일한 Character타입이지만
        // 서로 다르게 작동하고 있다. -> 다형성
        for (Character member : party) {
            member.attack(target);
        }
        // 추상클래스 상속 -> attack() 반드시 오버라이딩
        // -> 다형성이 보장


    }
}
