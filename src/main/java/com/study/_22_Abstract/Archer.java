package com.study._22_Abstract;

public class Archer extends Character{
    public Archer(String name) {
        super(name, 100, 20);
    }

    @Override
    public void attack(Character target) {
        String targetName = target.getName();
        System.out.println(this.name + "이" + targetName + "에게 쓰러진 용의 제물로 공격합니다.");
        target.receiveDamage(attackDamage);
        target.receiveDamage(attackDamage);
        target.receiveDamage(attackDamage + 100);
        System.out.println(targetName + "이" + attackDamage + "의 데미지를 받았습니다.");
    }
}
