package com.study._22_Abstract;

// 추상클래스: 추상메서드를 하나 이상 포함하는 클래스
// 추상메서드: 메서드의 시그니처만 정의하고, 구현(body)생략
public abstract class Character {
    protected String name;
    protected int HP;
    protected int attackDamage;

    public Character(String name, int HP, int attackDamage) {
        this.name = name;
        this.HP = HP;
        this.attackDamage = attackDamage;
    }

    // 캐릭터는 기본틀, 직업을가지면 공격하는 방식이 달라져야한다.
    // abstract를 적으면 추상메서드 메서드의 body영역이 없고
    // 오로지 시그니처만 정의한 메서드
    public abstract void attack(Character target);
    // 추상클래스를 상속 받으면, 반드시 추상메서드를 구현해야한다.
    // -> 오버라이딩 강제

    // 일반메서드도 정의할 수 있음
    public void receiveDamage(int damage) {
        this.HP -= damage;
        if (this.HP <= 0) {
            this.HP = 0;
            System.out.println(this.name + "가 쓰러졌습니다.");
        }
    }

    public String getName() {
        return this.name;
    }

}
