package com.study._22_Abstract;

public abstract class Character {
    protected String name;
    protected double HP;
    protected double attackDamage;

    public Character(String name, int HP, int attackDamage) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.HP = HP;
    }

    // 캐릭터는 기본틀, 직업을 가지면 공격하는 방식이 달라져야 한다.
    // abstract를 적으면,
    public abstract void attack(Character target);
    // 추상클래스를 상속받으면, 반드시 추상메서드를 구현해야 한다.
    // 오버라이딩 강제

    // 일반메서드도 정의 가능
    public void receiveDamage(double damage) {
        this.HP -= damage;
        if (this.HP <= 0) {
            this.HP = 0;
            System.out.println(this.name + "가 쓰러졌습니다.");
        }
    }

    public String getName() {
        return name;
    }

    public double getHP() {
        return HP;
    }

    public double getAttackDamage() {
        return attackDamage;
    }
}










